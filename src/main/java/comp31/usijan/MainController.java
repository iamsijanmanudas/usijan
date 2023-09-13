package comp31.usijan;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String getRoot() {
        return "login";
    }


    @GetMapping("/login")
    public String redirectToDepartment(  @RequestParam String username, @RequestParam String password, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        Map<String, String> userDepartmentMap = new HashMap<>();
        userDepartmentMap.put("Olivia", "Orders");
        userDepartmentMap.put("Ollie", "Orders");
        userDepartmentMap.put("Sam", "Sales");
        userDepartmentMap.put("Sue", "Sales");
        userDepartmentMap.put("Rachel", "Repairs");
        userDepartmentMap.put("Ralph", "Repairs");

    String departmentName = userDepartmentMap.getOrDefault(username, null);
    if (departmentName != null) {
        model.addAttribute("departmentName", departmentName);
        model.addAttribute("employeeName", username);
        return departmentName.toLowerCase();
    } else {
        return "home";
    }

    }
    @GetMapping("/image")
public String getImage(Model model) {
    model.addAttribute("name", "lol");
    return "Imagepage";
}

}

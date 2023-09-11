package comp31.usijan;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class MainController {

    @GetMapping("/login")
    public String getlogin(@RequestParam String username, @RequestParam String password, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);

        return "home";
    }
    
}

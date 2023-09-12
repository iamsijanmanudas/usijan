package comp31.usijan;

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
    public String getlogin(@RequestParam String username, @RequestParam String password, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);

        return "home";
    }
    @GetMapping("/image")
public String getImage(Model model) {
    model.addAttribute("name", "lol");
    return "Imagepage";
}

}

package sametime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @RequestMapping
    public String greeting(@RequestParam(value="name", required=false, defaultValue="june.kim") String name,
    Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

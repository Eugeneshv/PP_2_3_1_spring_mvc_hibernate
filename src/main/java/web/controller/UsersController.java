package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

    @GetMapping("/")
    public String welcomePage(@RequestParam(value = "first", required = false) String first,
            @RequestParam(value = "second", required = false) String second,
            @RequestParam(value = "sign", required = false) String sign,
            Model model) {
// temporary
        model.addAttribute("message", first  + "sign" + second);

        return "index";
    }

    @GetMapping("/listusers")
    public String listUsers() {

        return "listusers";
    }
}

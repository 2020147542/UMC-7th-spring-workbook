package umc.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import umc.spring.web.dto.MemberRequestDTO;

@Controller
public class MemberViewController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signUp")
    public String signUpPage(Model model) {
        model.addAttribute("memberJoinDto", new MemberRequestDTO.JoinDto());
        return "signup";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

}
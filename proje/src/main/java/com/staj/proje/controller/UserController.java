package com.staj.proje.controller;

import com.staj.proje.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/login"})
    public String getLoginPage() {
        return "login_page";
    }

    @PostMapping({"/login"})
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {
        if (this.userService.authenticateUser(username, password)) {
            if (this.userService.isUserInRole(username, "IKrole")) {
                return "redirect:/ik_page";
            }

            if (this.userService.isUserInRole(username, "IMrole")) {
                return "redirect:/im_page";
            }

            if (this.userService.isUserInRole(username, "Admin")) {
                return "redirect:/admin_page";
            }
        }

        redirectAttributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/login";
    }
}
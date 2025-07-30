package com.skillyheads.mvc.controller;

import com.skillyheads.mvc.entity.User;
import com.skillyheads.mvc.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "redirect:/register";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user,
                               BindingResult result, Model model) {

        // Check if passwords match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "error.user",
                    "Passwords do not match");
        }

        // Check if username already exists
        if (userRepository.existsByUsername(user.getUsername())) {
            result.rejectValue("username", "error.user",
                    "Username already exists");
        }

        if (result.hasErrors()) {
            return "register";
        }

        // Save user
        userRepository.save(user);
        model.addAttribute("message", "User registered successfully!");
        model.addAttribute("username", user.getUsername());

        return "success";
    }
}

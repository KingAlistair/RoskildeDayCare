package com.teletearbies.roskildedaycare.controller;

import com.teletearbies.roskildedaycare.entity.User;
import com.teletearbies.roskildedaycare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping(value = {"/", "/login"})
    public String showHomePage(){
        return "login";
    }

    @RequestMapping("/logUserIn")
    public String getAdminDashboard(@RequestParam("username")  String username,
                                    @RequestParam("password") String password,
                                    Model model){
         User user = userService.getUserByUsername(username);
         if(user.getPassword().equals(password)){
             model.addAttribute("adminName", user.getUsername());
             return "admin_dashboard";
         }
         else{
             model.addAttribute("errorMessage", "Wrong username or password!");
             return "error";
         }
    }

}

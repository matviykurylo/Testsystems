package ua.lviv.m.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.m.entities.User;
import ua.lviv.m.service.UserService;

import java.security.Principal;

/**
 * Created by home on 05.05.2017.
 */
@Controller
public class BaseController {
    @Autowired
    private UserService userService;


   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal, Model model){
       if (principal==null){}
else{           model.addAttribute("user",userService.findByEmail( principal.getName()));}
        return "account";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationPage(@RequestParam("name")String name, @RequestParam("surName")String surName, @RequestParam("fName")String fName, @RequestParam("email")String email,  @RequestParam("password")String password) {
        userService.save(new User(name, surName, fName, email, password));
        return "redirect:/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)

    public String signIn(Principal principal, Model model){
        if (principal==null){}
        else{
            model.addAttribute("user", userService.findById(Integer.parseInt(principal.getName())));}
        return "index";
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String profile(Principal principal, Model model) {
              if (principal==null){}
        else{           model.addAttribute("user", userService.findByEmail(principal.getName()));}
        return "account";
    }
    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public String users(Principal principal, Model model) {
              if (principal==null){}
        else{           model.addAttribute("user", userService.findByEmail(principal.getName()));}
        return "users";
    }
    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String tests(Principal principal, Model model) {
        if (principal==null){}
        else{           model.addAttribute("user", userService.findByEmail(principal.getName()));}
        return "tests";
    }
}

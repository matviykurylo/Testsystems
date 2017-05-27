package ua.lviv.m.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.m.entities.Groups;
import ua.lviv.m.entities.User;
import ua.lviv.m.service.GroupService;
import ua.lviv.m.service.UserService;

import java.security.Principal;
import java.util.List;

/**
 * Created by home on 09.05.2017.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers(Model model, Principal principal) {
        model.addAttribute("users", userService.findAll());

        return "users";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public String addUser(Model model) {

        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@RequestParam("name") String name, @RequestParam("surName") String surName,
                          @RequestParam("fName") String fName, @RequestParam("email") String email,
                          @RequestParam("password") String password, @RequestParam("role") String role) {

        userService.save(new User(name, surName, fName, email, password, role));

        return "redirect:/users";
    }

    @RequestMapping(value = "/users/edit/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable int id, Model model, Principal principal) {
        model.addAttribute("user", userService.findByEmail(principal.getName()));
        List<Groups> groupsList = groupService.findAll();
        model.addAttribute("groups", groupsList);
        return "edit-users";
    }

    @RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/";
    }
}

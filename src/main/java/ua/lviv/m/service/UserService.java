package ua.lviv.m.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.security.Principal;
import java.util.List;

/**
 * Created by home on 05.05.2017.
 */
public interface UserService {
    void save(ua.lviv.m.entities.User user);

void edit(ua.lviv.m.entities.User user);

    void delete(int id);

    ua.lviv.m.entities.User findById(int id);
    ua.lviv.m.entities.User findByEmail(String email);

   // ua.lviv.m.entities.User getUserInfo(String surName, String name, String fName);

    List<ua.lviv.m.entities.User> findAll();
    List<ua.lviv.m.entities.User> findAllByOrderBySurNameAsc();


    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;



}

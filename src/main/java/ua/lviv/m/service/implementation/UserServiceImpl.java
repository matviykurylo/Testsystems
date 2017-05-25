package ua.lviv.m.service.implementation;

import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.User;
import ua.lviv.m.repository.RoleRepo;
import ua.lviv.m.repository.UserRepo;
import ua.lviv.m.service.UserService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by home on 05.05.2017.
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {
@Autowired
    private UserRepo userRepo;
   @Autowired
    private RoleRepo roleRepo;


    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void edit(ua.lviv.m.entities.User user) {
userRepo.save(user);
    }

    @Override
    public void delete(int id) {
userRepo.delete(id);
    }

    @Override
    public ua.lviv.m.entities.User findById(int id) {
        return userRepo.findOne(id);
    }


    @Override
    public ua.lviv.m.entities.User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }


    @Override
    public List<ua.lviv.m.entities.User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public List<ua.lviv.m.entities.User> findAllByOrderBySurNameAsc() {
        return userRepo.findAllByOrderBySurNameAsc();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user = userRepo.findByEmail(email);
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }

    @Override
    public void add(String name, String surName, String fName, String email, String password, int roleID) {
        User user = new User(name, surName, fName, email, password);
        user.setRole(roleRepo.findOne(roleID));
        userRepo.save(user);
    }
    public String getUsername() {
        return String.valueOf(id);
    }

}

package ua.lviv.m.service;

import ua.lviv.m.entities.Role;
import ua.lviv.m.entities.Test;

import java.util.List;

/**
 * Created by home on 11.05.2017.
 */
public interface RoleService {
    List<Role> findAll();
    Role findById(int id);
}

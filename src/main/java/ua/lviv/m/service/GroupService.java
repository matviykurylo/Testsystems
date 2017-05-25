package ua.lviv.m.service;

import ua.lviv.m.entities.Groups;
import ua.lviv.m.entities.Role;

import java.util.List;

/**
 * Created by home on 11.05.2017.
 */
public interface GroupService {
    List<Groups> findAll();
}

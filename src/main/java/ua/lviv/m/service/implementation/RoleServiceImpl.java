package ua.lviv.m.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Role;
import ua.lviv.m.repository.RoleRepo;
import ua.lviv.m.service.RoleService;

import java.util.List;

/**
 * Created by home on 11.05.2017.
 */
@Service
public class RoleServiceImpl implements RoleService {

   @Autowired
   private RoleRepo roleRepo;
    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Role findById(int id) {
        return roleRepo.findOne(id);
    }

}

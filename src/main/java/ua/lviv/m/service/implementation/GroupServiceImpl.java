package ua.lviv.m.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Groups;
import ua.lviv.m.repository.GroupRepo;
import ua.lviv.m.service.GroupService;

import java.util.List;

/**
 * Created by home on 11.05.2017.
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepo groupRepo;
    @Override
    public List<Groups> findAll() {
        return groupRepo.findAll();
    }
}

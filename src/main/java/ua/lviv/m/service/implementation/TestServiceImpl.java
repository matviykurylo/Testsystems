package ua.lviv.m.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Test;
import ua.lviv.m.repository.TestRepo;
import ua.lviv.m.service.TestService;

import java.util.List;

/**
 * Created by home on 09.05.2017.
 */
@Service
public class TestServiceImpl implements TestService {
@Autowired
    private TestRepo testRepo;
    @Override
    public void add(Test test) {
        testRepo.saveAndFlush(test);
    }

    @Override
    public void edit(Test test) {
testRepo.saveAndFlush(test);
    }

    @Override
    public void delete(int id) {
testRepo.delete(id);
    }

    @Override
    public Test findById(int id) {
        return testRepo.findOne(id);

    }

    @Override
    public List<Test> findAll() {
        return testRepo.findAll();
    }

}

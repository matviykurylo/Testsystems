package ua.lviv.m.service;

import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Test;

import java.util.List;

/**
 * Created by home on 09.05.2017.
 */

public interface TestService {
    void add(Test test);

    void edit(Test test);

    void delete(int id);

    Test findById(int id);

    List<Test> findAll();


}

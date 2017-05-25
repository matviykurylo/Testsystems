package ua.lviv.m.service;

import ua.lviv.m.entities.Questions;
import ua.lviv.m.entities.Test;


import java.util.List;

/**
 * Created by home on 22.05.2017.
 */
public interface QuestionService {
    void add(String text, int price, Test test);

    void edit(Questions questions);

    void delete(int id);

    Questions findById(int id);

    List<Questions> findAll();
}

package ua.lviv.m.service;

import ua.lviv.m.entities.Answers;

import java.util.List;

/**
 * Created by home on 22.05.2017.
 */
public interface AnswerService {
    void add(Answers answers);

    void edit(Answers answers);

    void delete(int id);

    Answers findByQuestions();
    Answers findById(int id);
    List<Answers> findAll();
}

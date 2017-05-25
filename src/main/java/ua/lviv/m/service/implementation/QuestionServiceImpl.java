package ua.lviv.m.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Questions;
import ua.lviv.m.entities.Test;
import ua.lviv.m.repository.QuestionRepo;
import ua.lviv.m.service.QuestionService;

import java.util.List;

/**
 * Created by home on 22.05.2017.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    //    @Override
//    public void add(Questions questions) {
//questionRepo.saveAndFlush(questions);
//    }
    @Override
    public void add(String text, int price, Test test) {
        Questions questions = new Questions(text, price);
        questionRepo.saveAndFlush(questions);
        questions.setTest(test);
    }

    @Override
    public void edit(Questions questions) {
        questionRepo.saveAndFlush(questions);
    }

    @Override
    public void delete(int id) {
        questionRepo.delete(id);
    }

    @Override
    public Questions findById(int id) {
        return questionRepo.findOne(id);
    }

    @Override
    public List<Questions> findAll() {
        return questionRepo.findAll();
    }
}

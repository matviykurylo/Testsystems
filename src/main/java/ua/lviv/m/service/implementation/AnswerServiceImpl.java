package ua.lviv.m.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.m.entities.Answers;
import ua.lviv.m.repository.AnswerRepo;
import ua.lviv.m.service.AnswerService;

import java.util.List;

/**
 * Created by home on 22.05.2017.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepo answerRepo;

    @Override
    public void add(Answers answers) {
        answerRepo.saveAndFlush(answers);
    }

    @Override
    public void edit(Answers answers) {
        answerRepo.saveAndFlush(answers);
    }

    @Override
    public void delete(int id) {
        answerRepo.delete(id);
    }

    @Override
    public Answers findByQuestions() {
        return null;
    }

    @Override
    public Answers findById(int id) {
        return answerRepo.findOne(id);
    }

    @Override
    public List<Answers> findAll() {
        return answerRepo.findAll();
    }
}

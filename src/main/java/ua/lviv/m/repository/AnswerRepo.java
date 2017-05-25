package ua.lviv.m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.m.entities.Answers;

/**
 * Created by home on 22.05.2017.
 */
public interface AnswerRepo extends JpaRepository <Answers, Integer> {
    Answers findByQuestions(int id);
}

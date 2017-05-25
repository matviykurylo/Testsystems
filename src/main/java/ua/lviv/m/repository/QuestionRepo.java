package ua.lviv.m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.m.entities.Questions;

/**
 * Created by home on 22.05.2017.
 */
public interface QuestionRepo extends JpaRepository<Questions, Integer> {
Questions findByTest(int id);


}

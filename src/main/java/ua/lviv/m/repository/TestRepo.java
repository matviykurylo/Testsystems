package ua.lviv.m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.m.entities.Test;

/**
 * Created by home on 09.05.2017.
 */
public interface TestRepo extends JpaRepository<Test, Integer> {

}

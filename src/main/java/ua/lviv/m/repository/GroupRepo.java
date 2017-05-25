package ua.lviv.m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.m.entities.Groups;

/**
 * Created by home on 11.05.2017.
 */
public interface GroupRepo extends JpaRepository<Groups, Integer> {
}

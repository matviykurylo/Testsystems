package ua.lviv.m.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.m.entities.User;

import java.util.List;

/**
 * Created by home on 05.05.2017.
 */@Repository
public interface UserRepo extends JpaRepository <User, Integer> {
    User findByEmail(String email);


    List<User> findAllByOrderBySurNameAsc();
}

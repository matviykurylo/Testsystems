package ua.lviv.m.entities;

import org.hibernate.Session;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.hibernate.loader.plan.exec.internal.EntityLoadQueryDetails;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by home on 05.05.2017.
 */

@Entity
public class Role {
    @Id
    private int id;
    private String role;

    @OneToMany(mappedBy = "role")
    private List<User> userList;

    public Role() {
    }

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
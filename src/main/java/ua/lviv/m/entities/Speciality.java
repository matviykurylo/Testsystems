package ua.lviv.m.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by home on 11.05.2017.
 */
@Entity
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "speciality")
    private List<Groups> groupsList;

    public Speciality() {
    }

    public Speciality(String name) {
        this.name = name;
    }

    public List<Groups> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Groups> groupsList) {
        this.groupsList = groupsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

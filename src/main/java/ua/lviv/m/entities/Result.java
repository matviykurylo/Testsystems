package ua.lviv.m.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by home on 05.05.2017.
 */
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int mark;
    private Date date;

    @ManyToMany
    @JoinTable(name = "user_result", joinColumns = @JoinColumn(name = "id_result"), inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> userList;
    @ManyToMany
    @JoinTable(name = "result_test", joinColumns = @JoinColumn(name = "id_result"), inverseJoinColumns = @JoinColumn(name = "id_test"))
    private List<Test> testList;


    public Result() {
    }

    public Result(int mark, Date date) {
        this.mark = mark;
        this.date = date;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


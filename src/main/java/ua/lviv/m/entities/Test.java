package ua.lviv.m.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by home on 05.05.2017.
 */
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany
    @JoinTable(name = "user_test", joinColumns = @JoinColumn(name = "id_test"), inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> userList;
    @ManyToMany
    @JoinTable(name = "result_test", joinColumns = @JoinColumn(name = "id_test"), inverseJoinColumns = @JoinColumn(name = "id_result"))
    private List<Result> resultList;

    @OneToMany(mappedBy = "test")
    private List<Questions>questionsList;


    public Test() {
    }

    public Test(String title) {
        this.title = title;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }



    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
package ua.lviv.m.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by home on 05.05.2017.
 */
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private String price;


    @ManyToOne
    private Test test;
    @OneToMany(mappedBy = "questions")
    private List<Answers> answersList;

    public Questions() {
    }

    public Questions(String text, String price) {
        this.text = text;
        this.price = price;

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public List<Answers> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answers> answersList) {
        this.answersList = answersList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

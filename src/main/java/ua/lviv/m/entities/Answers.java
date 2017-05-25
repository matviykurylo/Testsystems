package ua.lviv.m.entities;

import javax.persistence.*;

/**
 * Created by home on 05.05.2017.
 */
@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String answer;
    private boolean isTrue;


    @ManyToOne
    private Questions questions;

    public Answers() {
    }

    public Answers(String answer, boolean isTrue) {
        this.answer = answer;
        this.isTrue = isTrue;
    }


    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return answer;
    }

    public void setText(String answer) {
        this.answer = answer;
    }
}
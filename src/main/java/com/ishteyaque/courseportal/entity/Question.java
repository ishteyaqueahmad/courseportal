package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @Column(name="QNO")
    private long questonNo;

    @Column(name = "QUESTION")
    private String question;

    @Column(name = "ANS1")
    private String answer1;

    @Column(name = "ANS2")
    private String answer2;

    @Column(name = "ANS3")
    private String answer3;

    @Column(name = "ANS4")
    private String answer4;

    @Column(name = "CORRECTANS")
    private String correctAns;
}

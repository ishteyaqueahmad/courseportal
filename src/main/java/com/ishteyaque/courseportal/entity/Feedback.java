package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FEEDBACK")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @Column(name = "FID")
    private long  feedbackId;
    @Column(name = "FEEDBACK")
    private String feedback;
    @Column(name = "UNAME")
    private String UserName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CITY")
    private String city;
    @Column(name = "PIN")
    private String pin;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "OCCUPATION")
    private String occupation;
}

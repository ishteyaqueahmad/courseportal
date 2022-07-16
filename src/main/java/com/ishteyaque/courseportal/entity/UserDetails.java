
package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long userId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String dateOfBirth;

    @Column
    private String dateOfResignation;

    @Column
    private String loginId;

    @Column
    private String password;

    @Column
    private String loginType;

    @Column
    private String forgotPassQuestion;

    @Column
    private String forgotPassAnswer;

    @Column
    private String photograph;

    @Column
    private String emailId;

    @Column
    private String faxNo;

    @Column
    private String qualification;

    @Column
    private long courseId;

}


/*
package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ANNOUNCEMENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {


    @Id
    @Column(name = "AID")
    private long aId;

    @Column(name = "DESCRIPTION")
    private String Description;

    @Column(name = "ADATE")
    private LocalDate announcementDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="COURSEID" )
    private Course courses;
}
*/

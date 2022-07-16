
package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long aId;

    @Column
    private String Description;

    @Column
    private LocalDate announcementDate;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name ="COURSEID" )
//    @Column
//    private Course courses;
}


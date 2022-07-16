
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
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long markId;
    @Column
    private long marks;

    @Column
    private String studentName;

    @Column
    private LocalDate examDate;


}


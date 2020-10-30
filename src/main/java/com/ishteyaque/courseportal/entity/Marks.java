package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="MARKS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marks {

    @Column(name = "MARKS")
    private long marks;

    @Column(name = "S_NAME")
    private String studentName;

    @Column(name = "EXAMDATE")
    private LocalDate examDate;


}

package com.ishteyaque.courseportal.entity;

import com.ishteyaque.courseportal.constants.Day;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="EXAMSCHEDULE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamSchedule {

    @Id
    @Column(name="EXAMID")
    private long examId;

    @Column(name="SUBJECT")
    private String subject;

    @Column(name = "EXAMDATE")
    private LocalDate examDate;

    @Column(name="DAY")
    private Day day;

    @Column(name="TIME")
    private LocalDate time;

}

package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "QUERY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Query {

    @Id
    @Column(name = "QUERYID")
    private long queryId;
    @Column(name = "USERID")
    private long userId;
    @Column(name = "QDESCRIPTION")
    private String queryDescription;
    @Column(name = "QSTATUS")
    private String queryStatus;
    @Column(name = "QDATE")
    private LocalDate queryDate;
}

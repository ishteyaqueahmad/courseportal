
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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginMaster {

    @Id
    @Column(name ="USERID" )
    private long userId;
    @Column(name = "LOGINDATE")
    private LocalDate loginDate;
    @Column(name ="LOGINTIME" )
    private LocalDate loginTime;
    @Column(name = "LOGOFFTIME")
    private LocalDate logoffTime;
}


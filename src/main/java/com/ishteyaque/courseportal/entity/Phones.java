
package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phones {

    @Id
    @Column(name = "USERID")
    private long userId;
    @Column(name = "PHONENO")
    private String phoneNo;
    @Column(name = "PHONETYPE")
    private String phoneType;
}


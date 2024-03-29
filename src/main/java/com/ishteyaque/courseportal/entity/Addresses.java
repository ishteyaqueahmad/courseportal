
package com.ishteyaque.courseportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USERID")
    private long userId;
    @Column(name = "ADDRESSID")
    private long addressId;
    @Column(name = "ADDRESSTYPE")
    private String addressType;
    @Column(name = "HOUSENO")
    private String houseNo;
    @Column(name ="STREET" )
    private String  street;
    @Column(name = "CITY")
    private String city;
    @Column(name ="STATE" )
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "PINCODE")
    private String pinCode;
}


package com.circuitmela.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String country;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

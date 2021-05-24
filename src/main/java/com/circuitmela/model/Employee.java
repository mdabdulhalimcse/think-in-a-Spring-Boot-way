package com.circuitmela.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    @OneToOne(cascade = CascadeType.ALL) // ALL,PERSIST,MERGE,REMOVE
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private Address address;
}

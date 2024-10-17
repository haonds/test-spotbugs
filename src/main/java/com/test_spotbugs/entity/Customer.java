package com.test_spotbugs.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    @Id
    private Long id;

    @Column
    private String name;
}

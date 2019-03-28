package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Getter
@Setter //@ToString
@EqualsAndHashCode
public class Dates {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "YEAR_ID")
    private int year;

    @Column(name = "MONTH_ID")
    private int month;

}

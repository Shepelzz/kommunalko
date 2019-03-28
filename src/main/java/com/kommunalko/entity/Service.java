package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICES")
@Getter
@Setter //@ToString
@EqualsAndHashCode(callSuper = true)
public class Service extends AbstractEntity{

    @Column(name = "NAME")
    private String name;


}

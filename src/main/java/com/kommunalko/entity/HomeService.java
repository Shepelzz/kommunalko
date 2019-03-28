package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOME_SERVICES")
@Getter
@Setter //@ToString
@EqualsAndHashCode(callSuper = true)
public class HomeService extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="HOME_ID")
    private Home home;

    @ManyToOne
    @JoinColumn(name="SERVICE_ID")
    private Service service;

}

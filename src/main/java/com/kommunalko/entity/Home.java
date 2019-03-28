package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "HOME")
@Getter
@Setter //@ToString
@EqualsAndHashCode(callSuper = true)
public class Home extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @Column(name = "ADDRESS")
    private String address;


}

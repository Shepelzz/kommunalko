package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "HOME_SERVICES_ACCOUNTS")
@Getter
@Setter //@ToString
@EqualsAndHashCode(callSuper = true)
public class HomeServiceAccount extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="HOME_SERVICES_ID")
    private HomeService homeService;

    @Column(name = "ACCOUNT")
    private String account;

}

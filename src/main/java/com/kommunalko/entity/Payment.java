package com.kommunalko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAYMENT")
@Getter
@Setter //@ToString
@EqualsAndHashCode(callSuper = true)
public class Payment extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="HOME_SERVICES_ACCOUNTS_ID")
    private HomeServiceAccount homeServiceAccount;

    @ManyToOne
    @JoinColumn(name="DATE_ID")
    private Dates date;

    @Column(name = "TARIFF")
    private float tariff;

    @Column(name = "ACTIVE_TARIFF")
    private boolean tariffActive;

    @Column(name = "INVOICE")
    private float invoice;

    @Column(name = "DATE_PAID")
    private Date datePaid;

}

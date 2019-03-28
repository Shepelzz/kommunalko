package com.kommunalko.entity;

import java.util.Date;

public class Payment extends AbstractEntity {

    private HomeServiceAccount homeServiceAccount;
    private Dates date;
    private float tariff;
    private boolean tariffActive;
    private float invoice;
    private Date datePaid;

}

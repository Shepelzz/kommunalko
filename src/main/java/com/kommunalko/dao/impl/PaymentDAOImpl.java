package com.kommunalko.dao.impl;

import com.kommunalko.dao.PaymentDAO;
import com.kommunalko.entity.Payment;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

@Log4j
@Repository
public class PaymentDAOImpl extends AbstractDAOImpl<Payment> implements PaymentDAO {
}

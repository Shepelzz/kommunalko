package com.kommunalko.dao.impl;

import com.kommunalko.dao.HomeServiceAccountDAO;
import com.kommunalko.entity.HomeServiceAccount;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

@Log4j
@Repository
public class HomeServiceAccountDAOImpl extends AbstractDAOImpl<HomeServiceAccount> implements HomeServiceAccountDAO {
}

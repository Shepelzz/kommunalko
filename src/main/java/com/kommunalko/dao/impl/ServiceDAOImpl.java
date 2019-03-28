package com.kommunalko.dao.impl;

import com.kommunalko.dao.ServiceDAO;
import com.kommunalko.entity.Service;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

@Log4j
@Repository
public class ServiceDAOImpl  extends AbstractDAOImpl<Service> implements ServiceDAO {
}

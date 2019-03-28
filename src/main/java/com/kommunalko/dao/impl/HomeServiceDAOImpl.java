package com.kommunalko.dao.impl;

import com.kommunalko.dao.HomeServiceDAO;
import com.kommunalko.entity.HomeService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

@Log4j
@Repository
public class HomeServiceDAOImpl extends AbstractDAOImpl<HomeService> implements HomeServiceDAO {
}

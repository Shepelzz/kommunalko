package com.kommunalko.dao.impl;

import com.kommunalko.dao.HomeDAO;
import com.kommunalko.entity.Home;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Repository;

@Log4j
@Repository
public class HomeDAOImpl extends AbstractDAOImpl<Home> implements HomeDAO {
}

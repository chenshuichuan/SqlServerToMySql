package com.ricardo.domain.sqlserverdata.service;

import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.sqlserverdata.bean.Book;
import com.ricardo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//import com.ricardo.repository.BookRepository;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */
@Service
public class UpdateTableServiceImpl implements UpdateTableService {


    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;//mysql myuser


    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;///sqlserver book


    public int addUser(Myuser myuser) {
        return jdbcTemplate1.update("insert into myuser(id, name,passwd) values(?, ?, ?)",
                myuser.getId(),myuser.getName(),myuser.getPasswd());
    }

    public int addBook(Book myuser) {
        return jdbcTemplate2.update("insert into book(b_id, b_name) values(?, ?)",
                myuser.getId(),myuser.getName());
    }



}

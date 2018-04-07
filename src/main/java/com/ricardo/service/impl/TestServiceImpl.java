package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.sqlserverdata.bean.Book;
//import com.ricardo.repository.BookRepository;
import com.ricardo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */
@Service
public class TestServiceImpl implements TestService {

//    @Autowired
//    private BookRepository bookRepository;

//    public int addBook(Book book) {
//
//        bookRepository.save(book);
//        return 1;
//    }

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

//    @Override
//    public int add(LearnResouce learnResouce) {
//        return jdbcTemplate.update("insert into learn_resource(author, title,url) values(?, ?, ?)",
//                learnResouce.getAuthor(),learnResouce.getTitle(),learnResouce.getUrl());
//    }
//
//    @Override
//    public int update(LearnResouce learnResouce) {
//        return jdbcTemplate.update("update learn_resource set author=?,title=?,url=? where id = ?",
//                new Object[]{learnResouce.getAuthor(),learnResouce.getTitle(),
//                        learnResouce.getUrl(),learnResouce.getId()});
//    }
//
//    @Override
//    public int deleteByIds(String ids){
//        return jdbcTemplate.update("delete from learn_resource where id in("+ids+")");
//    }
//
//    @Override
//    public LearnResouce queryLearnResouceById(Long id) {
//        List<LearnResouce> list = jdbcTemplate.query("select * from learn_resource where id = ?", new Object[]{id}, new BeanPropertyRowMapper(LearnResouce.class));
//        if(null != list && list.size()>0){
//            LearnResouce learnResouce = list.get(0);
//            return learnResouce;
//        }else{
//            return null;
//        }
//    }


}

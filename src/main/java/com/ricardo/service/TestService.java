package com.ricardo.service;

//import com.ricardo.domain.sqlserverdata.bean.Book;
//import com.ricardo.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface TestService {

    //public int addBook(Book myuser) ;

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

package com.ricardo.controller;


import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.mysqldata.jpa.MyuserRepository;
import com.ricardo.domain.sqlserverdata.bean.Book;
import com.ricardo.domain.sqlserverdata.jpa.BookRepository;
import com.ricardo.service.impl.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/2/1
 * Time: 10:41
 */
@RestController
public class HelloworldController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private TestServiceImpl testServiceImpl;

    @Autowired
    private MyuserRepository myuserRepository;
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/hello")
    public String index(){

        logger.trace("logging trace!");
        logger.debug("logging debug!");
        logger.info("logging info!");
        logger.warn("logging warm!");
        logger.error("logging error!");

        //String str =
        testServiceImpl.addUser(new Myuser(6,"mysql","jdbc mysql"));
        System.out.println("add user success！");
        testServiceImpl.addBook(new Book(6,"sqlserver"));
        System.out.println("add book success！");


        myuserRepository.save(new Myuser(7,"mysql777","jdbc mysql"));
        System.out.println("add user success！");
        testServiceImpl.addBook(new Book(7,"sqlserver"));
        System.out.println("add book success！");

        return  "Hello World!123";

    }
}

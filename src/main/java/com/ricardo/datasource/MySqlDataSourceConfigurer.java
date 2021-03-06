///*
// * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// * Vestibulum commodo. Ut rhoncus gravida arcu.
// */

package com.ricardo.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
import java.util.Properties;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryMySql",//实体管理引用
        transactionManagerRef="transactionManagerMySql",//失误管理引用
        basePackages = { "com.ricardo.domain.mysqldata"}) //设置用户数据源所应用到的包
public class MySqlDataSourceConfigurer
{
    //注入用户数据源
    @Autowired
    @Qualifier("primaryDataSource")
    private DataSource mySqlDataSource;

    //配置EntityManager实体
    @Bean(name = "entityManagerMySql")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryMySql(builder).getObject().createEntityManager();
    }

    //配置EntityManager工厂实体
    @Bean(name = "entityManagerFactoryMySql")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryMySql (EntityManagerFactoryBuilder builder) {
        LocalContainerEntityManagerFactoryBean em =
                builder.dataSource(mySqlDataSource)
                        .properties(getVendorProperties(mySqlDataSource))
                        .packages(new String[]{ "com.ricardo.domain.mysqldata" }) //设置应用creditDataSource的基础包名
                        .persistenceUnit("mySqlPersistenceUnit")
                        .build();

        Properties properties = new Properties();

//        properties.setProperty("hibernate.naming.strategy",
//                "org.hibernate.cfg.DefaultNamingStrategy");
        /*
        * 使用hibernate的数据库名称解析规则，而不是spring boot的规则，
        * springboot 规则回出现数据库字段"isCutted"这样的字段无法解析
        * */
        properties.setProperty("hibernate.physical_naming_strategy",
                "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");

        em.setJpaProperties(properties);
        return em;
    }

    //注入jpa配置实体
    @Autowired
    private JpaProperties jpaProperties;

    //获取jpa配置信息
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    //配置事务
    @Bean(name = "transactionManagerMySql")
    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryMySql(builder).getObject());
    }
}

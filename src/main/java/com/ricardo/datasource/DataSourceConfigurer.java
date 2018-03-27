package com.ricardo.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/30
 * Time：14:34
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
//@Configuration
//public class DataSourceConfigurer
//{
//
//    //用户数据源
//    @Bean(name = "mySqlDataSource")//装配该方法返回值为userDataSource管理bean
//    @Qualifier("mySqlDataSource")//spring装配bean唯一标识
//    @ConfigurationProperties(prefix="spring.datasource.mysql")//application.yml文件内配置数据源的前缀
//    public DataSource mySqlDataSource(){return DataSourceBuilder.create().build();}
//
//    //书籍数据源
//    @Bean(name = "sqlServerDataSource")
//    @Primary//配置该数据源为主数据源
//    @Qualifier("sqlServerDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.sqlserver")
//    public DataSource sqlServerDataSource(){return DataSourceBuilder.create().build();}
//}

@Configuration
public class DataSourceConfigurer
{
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.mysql")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.sqlserver")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("primaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(
            @Qualifier("secondaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
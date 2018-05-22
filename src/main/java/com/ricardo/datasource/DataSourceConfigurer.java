package com.ricardo.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

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

    @Autowired
    private Environment env;

    @Bean(name = "primaryDataSource",destroyMethod = "close")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.mysql")
    public DataSource primaryDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(env.getProperty("spring.datasource.mysql.url"));
        druidDataSource.setUsername(env.getProperty("spring.datasource.mysql.username"));
        druidDataSource.setPassword(env.getProperty("spring.datasource.mysql.password"));
        druidDataSource.setDriverClassName(env.getProperty("spring.datasource.mysql.driver-class-name"));

        druidDataSource.setInitialSize(2);//初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
        druidDataSource.setMaxActive(20);//最大连接池数量
        druidDataSource.setMinIdle(0);//最小连接池数量
        druidDataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
        druidDataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。
        //dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
        // dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        druidDataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。

        druidDataSource.setTestOnBorrow(true);
        druidDataSource.setTestOnReturn(true);
        druidDataSource.setTestWhileIdle(true);
        try {
            druidDataSource.setFilters(env.getProperty("spring.datasource.filters"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        druidDataSource.setUseGlobalDataSourceStat(true);
        //druidDataSource.setConnectProperties(new Properties(env.getProperty("")));
        //return DataSourceBuilder.create().build();
        return druidDataSource;
    }

    @Bean(name = "secondaryDataSource",destroyMethod = "close")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.sqlserver")
    public DataSource secondaryDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(env.getProperty("spring.datasource.sqlserver.url"));
        druidDataSource.setUsername(env.getProperty("spring.datasource.sqlserver.username"));
        druidDataSource.setPassword(env.getProperty("spring.datasource.sqlserver.password"));
        druidDataSource.setDriverClassName(env.getProperty("spring.datasource.sqlserver.driver-class-name"));
        //return DataSourceBuilder.create().build();
        druidDataSource.setInitialSize(2);//初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
        druidDataSource.setMaxActive(20);//最大连接池数量
        druidDataSource.setMinIdle(0);//最小连接池数量
        druidDataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
        druidDataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。
        //dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
        // dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        druidDataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。

        druidDataSource.setTestOnBorrow(true);
        druidDataSource.setTestOnReturn(true);
        druidDataSource.setTestWhileIdle(true);
        try {
            druidDataSource.setFilters(env.getProperty("spring.datasource.filters"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        druidDataSource.setUseGlobalDataSourceStat(true);

        return druidDataSource;
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
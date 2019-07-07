package com.example.duodian.until;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
@Configuration
@PropertySource("classpath:application.yml")
public class HikariCPUntil {
        private String url;
        private String userName;
        private String passWord;
        private String driverClassName;
        public void main(String[] args) throws Exception{
            //配置文件
            HikariConfig hikariConfig = new HikariConfig();
            hikariConfig.setJdbcUrl(url);//mysql
            hikariConfig.setDriverClassName(driverClassName);
            hikariConfig.setUsername(userName);
            hikariConfig.setPassword(passWord);
            hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

            HikariDataSource ds = new HikariDataSource(hikariConfig);
            Connection conn = null;
            Statement statement = null;
            ResultSet rs = null;
            try{

                //创建connection
                conn = ds.getConnection();
                statement = conn.createStatement();

                //执行sql
                rs = statement.executeQuery("select 100 s  from dual");

                //取数据
                if (rs.next()){
                    System.out.println(rs.getString("s"));
                }

                //关闭connection
                conn.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }

}

package com.riportal.config;  
  
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/*@ComponentScan("com.ri.ccexternal") */
  
@Configuration 
public class AppConfig {  
	
    @Bean
    public DataSource dataSource() {
 //      DriverManagerDataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource();
        BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUsername("myname");

		
		String env = System.getProperty("cc.env");
        switch (env.toLowerCase()) {
        case "dev":
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");        	
            break;
        case "int":
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");        	
            break;
        case "int1":
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");        	
            break;
        case "qa":
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");        	
            break;
        case "prod":
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");        	
    		break;
        default: 
    		dataSource.setUrl("jdbc:sqlserver://x.com:2005;SelectMethod=direct;DatabaseName=ClaimCenterExternal;");
    		dataSource.setPassword("dummy");
        	break;
    }
		return dataSource;
   }	
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		//sessionFactory.setTypeAliasesPackage("org.lanyonm.playground.domain");
		return sessionFactory;
	}	

	
	
	
}  

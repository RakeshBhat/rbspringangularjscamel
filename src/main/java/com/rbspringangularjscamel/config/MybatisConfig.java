package com.rbspringangularjscamel.config;

import org.apache.camel.component.mybatis.MyBatisComponent;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

	@Bean(name="mybatis")
	public MyBatisComponent myBatisComponent( SqlSessionFactory sqlSessionFactory )
	{
	    MyBatisComponent result = new MyBatisComponent();
	    result.setSqlSessionFactory( sqlSessionFactory );
	    return result;
	}
}

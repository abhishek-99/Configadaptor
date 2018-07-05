package com.abhi.jpa.config;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value= {@ComponentScan("com.abhi.jpa.dao"),@ComponentScan("com.abhi.jpa.service")})
public class AppConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
		return localEntityManagerFactoryBean;
	}
	@Bean
	public JpaTransactionManager geTransactionManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
		return jpaTransactionManager;
	}
}

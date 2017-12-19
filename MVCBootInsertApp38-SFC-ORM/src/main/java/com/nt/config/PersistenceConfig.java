package com.nt.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.nt.domain.StudentHLO;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	@Autowired
	private DataSource ds;
	
	@Bean(autowire=Autowire.BY_TYPE)
	public LocalSessionFactoryBean  createLocalSessionFactoryBean(){
		LocalSessionFactoryBean localSesFact=null;
		localSesFact=new LocalSessionFactoryBean();
		//localSesFact.setDataSource(ds);
		localSesFact.setAnnotatedClasses(StudentHLO.class);
		localSesFact.setAnnotatedPackages("com.nt.domain");
		return localSesFact;
	}
	
	@Bean
	@Primary
	public  SessionFactory createSessionFactory(){
		 return  createLocalSessionFactoryBean().getObject();
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public  HibernateTemplate  createHibernateTemplate(){
		return new HibernateTemplate();
	}

	
	/*@Bean
	public LocalSessionFactoryBean  createLocalSessionFactoryBean(){
		LocalSessionFactoryBean localSesFact=null;
		localSesFact=new LocalSessionFactoryBean();
		localSesFact.setDataSource(ds);
		localSesFact.setAnnotatedClasses(StudentHLO.class);
		localSesFact.setAnnotatedPackages("com.nt.domain");
		return localSesFact;
	}
	
	
	
	@Bean(autowire=Autowire.BY_TYPE)
	public  HibernateTemplate  createHibernateTemplate(){
		return new HibernateTemplate();
	}*/

	
}

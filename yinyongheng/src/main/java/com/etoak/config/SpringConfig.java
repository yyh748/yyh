package com.etoak.config;


import com.etoak.Controller.BookController;

import com.etoak.Service.BookService;
import com.etoak.Service.impl.BookServiceWithEmail;
import com.etoak.Service.impl.BookServiceWithSMS;
import com.etoak.dao.BookDao;

import com.etoak.dao.impl.BookDao4MySQL;
import com.etoak.dao.impl.BookDao4Oracle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // <beans>
public class SpringConfig {

	@Bean // <bean id="方法名">
	public BookService bookServiceWithSMS() {
		return  new BookServiceWithSMS();


	}
	@Bean // <bean id="方法名">
	public BookService bookServiceWithEmail() {
		return  new BookServiceWithEmail();


	}

	@Bean
	public BookController bookController() {
		return new BookController();
	}
	@Bean
	public BookDao bookDao4Oracle(){return new BookDao4Oracle();

	}
	@Bean
	public BookDao bookDao4MySQL(){return new BookDao4MySQL();

	}

}

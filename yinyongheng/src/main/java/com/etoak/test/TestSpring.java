package com.etoak.test;

import com.etoak.Controller.BookController;
import com.etoak.config.SpringConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestSpring {

	public static void main(String[] args) {
//		ApplicationContext ac =
//				new ClassPathXmlApplicationContext("spring.xml");
//		BookController bc = ac.getBean("bookController",BookController.class);
//		bc.gogo();
		ApplicationContext ioc = new
				AnnotationConfigApplicationContext(SpringConfig.class);

		BookController BookController = ioc.getBean(BookController.class);
		BookController.gogo();

	}

}

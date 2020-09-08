package com.etoak.Service.impl;

import com.etoak.Service.BookService;
import com.etoak.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class BookServiceWithEmail implements BookService {


	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	@Override
	public void testService() {
		System.out.println("24345");
		dao.testDao();
	}

}

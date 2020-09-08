package com.etoak.Service.impl;

import com.etoak.Service.BookService;
import com.etoak.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//@Service
public class BookServiceWithSMS implements BookService {

	@Resource(name="bookDao4Oracle")
	private BookDao dao;
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	@Override
	public void testService() {
		System.out.println("uyryft");
		dao.testDao();
	}

}

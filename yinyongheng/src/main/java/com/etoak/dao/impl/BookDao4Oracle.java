package com.etoak.dao.impl;



import com.etoak.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
public class BookDao4Oracle implements BookDao {

	@Override
	public void testDao() {
		System.out.println("123");
	}

}

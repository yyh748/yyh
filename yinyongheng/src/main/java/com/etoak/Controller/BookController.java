package com.etoak.Controller;


import com.etoak.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class BookController {
	
	@Autowired
	@Qualifier("bookServiceWithSMS")
	private BookService service;
	public void setService(BookService service) {
		this.service = service;
	}
	public void gogo(){
		System.out.println("Controllerִ�в����� ׼������service");
		service.testService();
	}

	public void testService() {
	}


}

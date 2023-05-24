package com.example.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Book;
import com.example.Student.bookservice.Bookservice;

@RestController
 
public class Controller {
	@GetMapping("/home")
	 public Book getdata()
	 {
		 Book b=new Book();
		 b.setBid(101);
		 b.setBname("AI");
		 b.setBprice(500);
		 b.setAuthor("AK");
		 
		 return b;
		 
	 }
	@Autowired
	private Bookservice bs;
	@GetMapping("/Book")
	public List<Book> getBooks()
	{
		return this.bs.getAllBooks();
	}
	@GetMapping("/Book/{id}")
   public Book getBook(@PathVariable("id")int id)
   {
	  return bs.getById(id);
	  
   }
}

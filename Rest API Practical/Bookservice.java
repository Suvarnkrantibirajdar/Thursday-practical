package com.example.Student.bookservice;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

import com.example.Student.Entity.Book;

@Component
public class Bookservice {
	 
 	 public static List<Book> list=new ArrayList<Book>();
 			 
 		static 
 		{
 		 	list.add(new Book(101,"c",500,"ABC"));
 		 	list.add(new Book(102,"c++",600,"PQR"));
 		 	list.add(new Book(103,"python",1000,"XYZ"));
 		 
 		 }
 	 
 	 	 public List<Book> getAllBooks()
 	 	 
 	 	 {
 	 		 return list;
 	 		 
 	 	 }
 	 	 public Book getById(int id)
 	 	 {
 	 		 Book book=null;
 	 		 book=list.stream().filter(e->e.getBid()==id).findFirst().get();
 	 		 return book;
 	 	 }
}

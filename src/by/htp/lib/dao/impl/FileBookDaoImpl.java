package by.htp.lib.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.htp.lib.bean.Author;
import by.htp.lib.bean.Book;
import by.htp.lib.dao.BookDao;

public class FileBookDaoImpl implements BookDao{

private static final String FILE_PATH="sources/Library.txt";
	
	@Override
	public Book[] readAll() throws Exception {
	Book[] books=new Book[5];
		BufferedReader br;
	try {
	br=new BufferedReader(new FileReader(FILE_PATH));
	String line;
	int count = 0;
	
	while((line=br.readLine())!=null){
		books[count]=valueOfString(count,line);
		count++;
	}
				br.close();		
	}catch(FileNotFoundException e) {
		System.out.println("File not found !!!");
	}
		return books;
	}

public Book valueOfString(int id,String s) {
	Book b=new Book();
	String[] arrayString=new String[5];
	arrayString=s.split(",");
	b.setId(Integer.parseInt(arrayString[0]));
	b.setTitle(arrayString[1].trim());
	b.setYear(Integer.parseInt(arrayString[2].trim()));
	Author author=new Author( id,arrayString[3].trim(),arrayString[4].trim() );
    b.setAuthor(author);
	return b;
}
	
	
	
	

}
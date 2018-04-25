package by.htp.lib.logic.impl;

import java.io.IOException;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.dao.BookDao;
import by.htp.lib.dao.impl.FileBookDaoImpl;
import by.htp.lib.logic.LibraryService;

public class LibraryServiceImpl implements LibraryService{

	private BookDao dao=new FileBookDaoImpl();
	
	@Override
	public Catalog getMainCatalog() throws Exception {
		Catalog catalog=new Catalog();
		Book[] books=dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_BOOK_CATALOG");
		return catalog;
	}

}

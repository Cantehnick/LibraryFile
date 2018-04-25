package by.htp.lib.run;

import java.io.IOException;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.logic.LibraryService;
import by.htp.lib.logic.impl.LibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) throws Exception {

		LibraryService service = new LibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);
	}

	private static void viewCatalogInfo(Catalog catalog) {
		for (Book book : catalog.getBooks()) {
			System.out.println(book);
		}
	}
}
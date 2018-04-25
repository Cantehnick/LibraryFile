package by.htp.lib.dao;

import java.io.IOException;

import by.htp.lib.bean.Book;

public interface BookDao {

	Book[] readAll() throws  Exception;
}

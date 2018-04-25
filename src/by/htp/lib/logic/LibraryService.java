package by.htp.lib.logic;

import java.io.IOException;

import by.htp.lib.bean.Catalog;

public interface LibraryService {

	Catalog getMainCatalog() throws  Exception;
}

package by.htp.lib.bean;

public class Author {

private int id;
private String name;
private String surName;


public Author() {
	super();
	// TODO Auto-generated constructor stub
}


public Author(int id, String name, String surName) {
	super();
	this.id = id;
	this.name = name;
	this.surName = surName;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getSurName() {
	return surName;
}


public void setSurName(String surName) {
	this.surName = surName;
}


@Override
public String toString() {
	return "Author [getName()=" + getName() + ", getSurName()=" + getSurName() + "]";
}













}

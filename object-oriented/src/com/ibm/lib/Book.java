package com.ibm.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}
	
	public void issueBook(Member m) {
		if(this.mbr == null && m.getBook() == null) {
			this.mbr = m;
			m.setBook(this);
			System.out.println("Book is issued");
		} else
			System.out.println("Book cannot be issued");
	}
	
	public void returnBook(Member m) {
		if(this.mbr != null && m.getBook() != null) {
			m.setBook(null);
			this.mbr = null;
			System.out.println("Book is returned");
		} else 
			System.out.println("Book cannot be returned");
	}
}

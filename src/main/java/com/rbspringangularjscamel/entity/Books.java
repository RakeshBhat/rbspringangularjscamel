package com.rbspringangularjscamel.entity;

public class Books {

	int bookCode;
	String name;
	String author;
	String edition;
	String tags;
	String notes;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Books [bookCode=").append(bookCode).append(", name=").append(name).append(", author=")
				.append(author).append(", edition=").append(edition).append(", tags=").append(tags).append(", notes=")
				.append(notes).append("]");
		return builder.toString();
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}

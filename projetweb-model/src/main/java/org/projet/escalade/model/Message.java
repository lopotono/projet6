package org.projet.escalade.model;

public class Message {
	
	private User author;
	private String message;
	
	public Message() {
		
	}
	
	public Message(User pAuthor, String pMessage) {
		author = pAuthor;
		message = pMessage;
	}
	
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSEP = ", ";
		vStB.append(" {")
			.append("author=").append(author)
			.append(vSEP).append("message=\"").append(message).append('"')
			.append("}");
		return vStB.toString();
	}
 }

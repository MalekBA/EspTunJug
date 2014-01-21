package org.esptunjug.domain;

public class MessageJug {
	
	
	private String from="";
	private String subject="";
	private String body="";
	
	
	public MessageJug() {
		// TODO Auto-generated constructor stub
	}


	public MessageJug(String from, String subject, String body) {
		super();
		this.from = from;
		this.subject = subject;
		this.body = body;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	@Override
	public String toString() {
		return "MessageJug [from=" + from + ", subject=" + subject + ", body="
				+ body + "]";
	}
	
	
	

}

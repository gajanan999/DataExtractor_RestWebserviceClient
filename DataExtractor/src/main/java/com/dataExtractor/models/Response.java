package com.dataExtractor.models;

public class Response {

	private Long id;
	private String content;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Response() {

	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Response [id=" + id + "    Content : "+content +"]";
	}

}

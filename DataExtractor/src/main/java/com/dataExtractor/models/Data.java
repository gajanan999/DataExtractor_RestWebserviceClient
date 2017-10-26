package com.dataExtractor.models;

public class Data {

	
	private final long id;
    private final String content;

    public Data(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

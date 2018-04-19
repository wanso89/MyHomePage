package com.homepage.dto;

import org.apache.ibatis.type.Alias;

@Alias("BoardDTO")
public class BoardDTO {
	
	private int num;
	private String title;
	private String author;
	private String writeday;
	private int readCnt;
	private String content;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", title=" + title + ", author=" + author + ", writeday=" + writeday
				+ ", readCnt=" + readCnt + ", content=" + content + "]";
	}
	
	
	
	
	
	
	
}

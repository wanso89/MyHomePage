package com.homepage.dto;

import org.apache.ibatis.type.Alias;

@Alias("CommentDTO")
public class CommentDTO {

	private int commentNum;
	private String commentAuthor;
	private String commentContent;
	private String commentPasswd;
	private String commentWriteday;
	
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public String getCommentAuthor() {
		return commentAuthor;
	}
	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentPasswd() {
		return commentPasswd;
	}
	public void setCommentPasswd(String commentPasswd) {
		this.commentPasswd = commentPasswd;
	}
	public String getCommentWriteday() {
		return commentWriteday;
	}
	public void setCommentWriteday(String commentWriteday) {
		this.commentWriteday = commentWriteday;
	}
	
	@Override
	public String toString() {
		return "CommentDTO [commentNum=" + commentNum + ", commentAuthor=" + commentAuthor + ", commentContent="
				+ commentContent + ", commentPasswd=" + commentPasswd + ", commentWriteday=" + commentWriteday + "]";
	}
	
	
	
	
	
}

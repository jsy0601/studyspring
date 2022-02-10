package com.dealim.univ.domain;

public class Board {
	
	private int boardNo;
	private String expDate;
	private String sort;
	private String code;
	private String cost;
	private String content;
	private String regDate;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", expDate=" + expDate + ", sort=" + sort + ", code=" + code + ", cost="
				+ cost + ", content=" + content + ", regDate=" + regDate + "]";
	}
	
}

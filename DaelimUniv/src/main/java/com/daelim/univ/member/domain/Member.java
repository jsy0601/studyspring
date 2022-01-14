package com.daelim.univ.member.domain;

public class Member {

	private String userId;
	private String password;
	private String job;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", job=" + job + "]";
	}
}

package com.ms.studentinfo.model.student;

public class StudentScore {

	private int id;
	private int score;
	
	public StudentScore() {
		// TODO Auto-generated constructor stub
	}
	public StudentScore(int id, int score) {
		this.id = id;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
}

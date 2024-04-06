package com.tnsif.certificateservice;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Certificate
{
	@Id
	@Column(name="certid")
	private int certid;
	@Column(name="studname")
	private String studname;
	@Column(name="dept")
	private String dept;
	@Column(name="grade")
	private String grade;
	@Column(name="year")
	private int year;
	@Column(name="gender")
	private char gender;
	@Column(name="dateofissue")
	private int dateofissue;
	public int getCertid() {
		return certid;
	}
	public void setCertid(int certid) {
		this.certid = certid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getDateofissue() {
		return dateofissue;
	}
	public void setDateofissue(int dateofissue) {
		this.dateofissue = dateofissue;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(int certid, String studname, String dept, String grade, int year, char gender, int dateofissue) {
		super();
		this.certid = certid;
		this.studname = studname;
		this.dept = dept;
		this.grade = grade;
		this.year = year;
		this.gender = gender;
		this.dateofissue = dateofissue;
	}
	@Override
	public String toString() {
		return "Certificate [certid=" + certid + ", studname=" + studname + ", dept=" + dept + ", grade=" + grade
				+ ", year=" + year + ", gender=" + gender + ", dateofissue=" + dateofissue + "]";
	}
	
}

package gameDemo.Entities;

import java.time.LocalDate;

public class Gamer {
	private int id;
	private String fitstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	public Gamer(int id, String fitstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		
		this.id = id;
		this.fitstName = fitstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFitstName() {
		return fitstName;
	}
	public void setFitstName(String fitstName) {
		this.fitstName = fitstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}

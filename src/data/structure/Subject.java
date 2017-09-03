package data.structure;

/**
 * Person which is on photograph
 * 
 * @author Adam Barák
 * @version 30.08.2017
 */
public class Subject {
	String identification;
	String gender;
	String race;
	
	public Subject() {
		this("");
	}
	
	public Subject(String identification) {
		this(identification, "", "");
	}
	
	public Subject(String identification, String gender, String race) {
		this.identification = identification;
		this.gender = gender;
		this.race = race;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	
	
}

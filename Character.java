import java.lang.annotation.Annotation;
import com.fasterxml.jackson.annotation.*;

public class Character {

	private String uid;
	private String name;
	private String gender;
	private String yearOfBirth;
	private String monthOfBirth;
	private String dayOfBirth;
	private String placeOfBirth;
	private String yearOfDeath;
	private String monthOfDeath;
	private String dayOfDeath;
	private String placeOfDeath;
	private String height;
	private String weight;
	private String deceased;
	private String bloodType;
	private String maritalStatus;
	private String serialNumber;
	private String mirror;
	private boolean alternateReality;


	public Character(){}

	/**
	* Returns value of uid
	* @return
	*/
	public String getUid() {
		return uid;
	}

	/**
	* Sets new value of uid
	* @param
	*/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of gender
	* @return
	*/
	public String getGender() {
		return gender;
	}

	/**
	* Sets new value of gender
	* @param
	*/
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	* Returns value of yearOfBirth
	* @return
	*/
	public String getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	* Sets new value of yearOfBirth
	* @param
	*/
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	/**
	* Returns value of monthOfBirth
	* @return
	*/
	public String getMonthOfBirth() {
		return monthOfBirth;
	}

	/**
	* Sets new value of monthOfBirth
	* @param
	*/
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	/**
	* Returns value of dayOfBirth
	* @return
	*/
	public String getDayOfBirth() {
		return dayOfBirth;
	}

	/**
	* Sets new value of dayOfBirth
	* @param
	*/
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	/**
	* Returns value of placeOfBirth
	* @return
	*/
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	/**
	* Sets new value of placeOfBirth
	* @param
	*/
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	/**
	* Returns value of yearOfDeath
	* @return
	*/
	public String getYearOfDeath() {
		return yearOfDeath;
	}

	/**
	* Sets new value of yearOfDeath
	* @param
	*/
	public void setYearOfDeath(String yearOfDeath) {
		this.yearOfDeath = yearOfDeath;
	}

	/**
	* Returns value of monthOfDeath
	* @return
	*/
	public String getMonthOfDeath() {
		return monthOfDeath;
	}

	/**
	* Sets new value of monthOfDeath
	* @param
	*/
	public void setMonthOfDeath(String monthOfDeath) {
		this.monthOfDeath = monthOfDeath;
	}

	/**
	* Returns value of dayOfDeath
	* @return
	*/
	public String getDayOfDeath() {
		return dayOfDeath;
	}

	/**
	* Sets new value of dayOfDeath
	* @param
	*/
	public void setDayOfDeath(String dayOfDeath) {
		this.dayOfDeath = dayOfDeath;
	}

	/**
	* Returns value of placeOfDeath
	* @return
	*/
	public String getPlaceOfDeath() {
		return placeOfDeath;
	}

	/**
	* Sets new value of placeOfDeath
	* @param
	*/
	public void setPlaceOfDeath(String placeOfDeath) {
		this.placeOfDeath = placeOfDeath;
	}

	/**
	* Returns value of height
	* @return
	*/
	public String getHeight() {
		return height;
	}

	/**
	* Sets new value of height
	* @param
	*/
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	* Returns value of weight
	* @return
	*/
	public String getWeight() {
		return weight;
	}

	/**
	* Sets new value of weight
	* @param
	*/
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	* Returns value of deceased
	* @return
	*/
	public String getDeceased() {
		return deceased;
	}

	/**
	* Sets new value of deceased
	* @param
	*/
	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	/**
	* Returns value of bloodType
	* @return
	*/
	public String getBloodType() {
		return bloodType;
	}

	/**
	* Sets new value of bloodType
	* @param
	*/
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	/**
	* Returns value of maritalStatus
	* @return
	*/
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	* Sets new value of maritalStatus
	* @param
	*/
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	* Returns value of serialNumber
	* @return
	*/
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	* Sets new value of serialNumber
	* @param
	*/
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	* Returns value of mirror
	* @return
	*/
	public String getMirror() {
		return mirror;
	}

	/**
	* Sets new value of mirror
	* @param
	*/
	public void setMirror(String mirror) {
		this.mirror = mirror;
	}

	/**
	* Returns value of alternateReality
	* @return
	*/
	public boolean isAlternateReality() {
		return alternateReality;
	}

	/**
	* Sets new value of alternateReality
	* @param
	*/
	public void setAlternateReality(boolean alternateReality) {
		this.alternateReality = alternateReality;
	}
}

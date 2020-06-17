import java.util.*;
import java.io.*;	
public class PersonInfo {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNum;

	public PersonInfo(){
		this.firstName = "";
		this.lastName = "";
		this.address = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.phoneNum = "";
	}
	
	public PersonInfo(String firstName, String lastName, String address,String city, String state, String zip, String phoneNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city= city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
		
	public void display(){
		System.out.println("|\tName:" +firstName+" "+lastName+"\t|");
		System.out.println("|\tAddress:" +address+" "+city+"\t|");
		System.out.println("|\t\t"+state+" "+zip+"\t|");
		System.out.println("|\tMobile:"+phoneNum+"\t|");	
	}
}
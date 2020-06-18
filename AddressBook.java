import java.util.*;
import java.io.*;

public class AddressBook extends PersonInfo{
	private ArrayList<PersonInfo> personList;
	public Scanner input = new Scanner(System.in);
	public AddressBook() {
		personList = new ArrayList<PersonInfo>();
	}

	public void addAddress(){
		System.out.print("Enter First Name: ");
		String firstName = input.next();
		System.out.print("Enter Last Name: ");
		String lastName = input.next();
		System.out.print("Enter Address: ");
		String address = input.next();
		System.out.print("Enter City: ");
		String city = input.next();
		System.out.print("Enter State: ");
		String state = input.next();
		System.out.print("Enter the Zip Code: ");
		String zip = input.next();
		System.out.print("Enter the Phone Number: ");
		String phoneNum = input.next();
		PersonInfo person = new PersonInfo( firstName, lastName, address,city, state, zip, phoneNum);
		personList.add(person);
	}
	
	public void showAllAddress(){
		for (int i=0; i<personList.size(); i++){
			System.out.println("---------------------------------");
			personList.get(i).display();
			System.out.println("---------------------------------");
		}
	}

	public int findPerson(String name){
		int count = 0;
		while(count < personList.size()){
			if((personList.get(count).firstName).equals(name))
				return count;
			count++;
		}
		return count;
	}
	public void Search(){
		System.out.println("Enter First name of person to git details: ");
		String name = input.next();
		int count=findPerson(name);
		System.out.println("---------------------------------");
		personList.get(count).display();
		System.out.println("---------------------------------\n");
	}
	public void editAddress(){
		System.out.println("Enter First name of person to Edit: ");
		String name = input.next();
		int count = 0;
		count = findPerson(name);
		if (count < personList.size()) {
			System.out.println("---------------------------------");
			personList.get(count).display();
			System.out.println("---------------------------------\n");
			System.out.print("Enter First Name: ");
			String firstName = input.next();
			System.out.print("Enter Last Name: ");
			String lastName = input.next();
			System.out.print("Enter Address: ");
			String address = input.next();
			System.out.print("Enter City: ");
			String city = input.next();
			System.out.print("Enter State: ");
			String state = input.next();
			System.out.print("Enter the Zip Code: ");
			String zip = input.next();
			System.out.print("Enter the Phone Number: ");
			String phoneNum = input.next();
			PersonInfo person = new PersonInfo( firstName, lastName, address,city, state, zip, phoneNum);
			personList.set(count, person);
			System.out.println("Address Edited Successfully");
		}
		else {
			System.out.println("Address not found");
		}
}

	public void deleteAddress(){
		System.out.println("Enter the First name to Delete Address: ");
		String name = input.next();
		int count = findPerson(name);
		if (count < personList.size()){
			personList.remove(count);
			System.out.println("Address Deleted Successfully");
		}
		else 
			System.out.println("Address not found");
	}
	
	Comparator<PersonInfo> compareByLastName = Comparator.comparing( PersonInfo::getLastName );
	Comparator<PersonInfo> compareByZip = Comparator.comparing( PersonInfo::getZip);
	
	public void sortAddressBook(){
		System.out.println("1.Sort by Last Name");
		System.out.println("2.Sort by ZipCode");
		System.out.println("Enter Sort Choice:");
		int choice = input.nextInt();
		if(choice ==1)
			Collections.sort(personList, compareByLastName);
		else
			Collections.sort(personList, compareByZip);
	}

	public void save(){
		try {
			System.out.println("Enter The file name to save:");
			String fileName = input.next();
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName+".txt", true)); 
			for(int i=0; i<personList.size(); i++) {
				out.write("----------------------------------------------------\n"+System.lineSeparator());
				//out.write(personList.get(i).saveToFile()+System.lineSeparator());
				out.write("Name: "+personList.get(i).getFirstName()+" "+personList.get(i).getLastName()+System.lineSeparator());
				out.write("Adress: "+personList.get(i).getAddress()+" "+personList.get(i).getCity());
				out.write(" "+personList.get(i).getState()+" "+personList.get(i).getZip()+System.lineSeparator());
				out.write("Mobile No: +91 "+personList.get(i).getPhoneNum()+System.lineSeparator());
				out.write("----------------------------------------------------\n"+System.lineSeparator());
			}
			System.out.println("file saved with name: "+fileName+".txt");
			out.close();
		} 
		catch(Exception e) {
			e.printStackTrace();          
		}
	}	
}
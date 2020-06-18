import java.util.*;
import java.io.*;

public class AddressBookController{
	public static void main(String[] ars)throws Exception{
		Scanner input = new Scanner(System.in);
		AddressBook aB = new AddressBook();
		while(true){
			System.out.println("==================Menu==================");
			System.out.println("|\t1.Add Person\t\t\t|"); 
			System.out.println("|\t2.Edit Person\t\t\t|");
			System.out.println("|\t3.Delete Person\t\t\t|");
			System.out.println("|\t4.Display All Person Details\t|");
			System.out.println("|\t5.Sort Person\t\t\t|");
			System.out.println("|\t6.Search Person\t\t\t|");
			System.out.println("|\t7.Save AddressBook\t\t|");
			System.out.println("|\tEnter any number to exit\t|");
			System.out.println("========================================");
			System.out.print("Enter your Choice: ");
			int choice = Integer.parseInt(input.nextLine());
			switch(choice) {
				case 1:
					aB.addAddress();
					break;
				case 2:
					aB.editAddress();
					break;
				case 3:
					aB.deleteAddress();
					break;
				case 4:
					aB.showAllAddress();
					break;
				case 5:
					aB.sortAddressBook();
					break;
				case 6:
					aB.Search();
					break;
				case 7:
					aB.save();
					break;
				default:
					break;
			}
			if(choice ==0|| choice > 7)
				break;
		}
    }
}
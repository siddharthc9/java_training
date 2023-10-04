package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MavericOrg {

	private static int flag;
	private static int flag1;

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		System.out.println(emp1);
//		
//		Employee emp2 = new Employee(1001,"Sagar",90000);
//		System.out.println(emp2);
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the emplyee details::");
//		
//		System.out.println("Enter emp ID:");
//		int id= input.nextInt();
//		
//		System.out.println("Enter emp Name:");
//		String name = input.next();
//		
//		System.out.println("Enter emp salary:");
//		double sal = input.nextDouble();
//		
//		Employee emp3 = new Employee(id,name,sal);
//		System.out.println(emp3);
		
		ArrayList<Employee> empList =new ArrayList<>();
		Scanner input =new Scanner(System.in);
		char ch;
		do {
			System.out.println("1>Add new record\n2>Display record\n3>Delete Record\n4>Update Records\n5>Salary Increament\n\n");
			int choice=input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Emp Id:");
				int id=input.nextInt();
				System.out.println("Enter Emp Name:");
				String name=input.next();
				System.out.println("Enter Emp Salary:");
				double sal=input.nextDouble();
				
				empList.add(new Employee(id,name,sal));
				System.out.println("Record is added Successfully....");
				break;
			case 2:
				System.out.println("************Employee record are**********");
				for (Employee employee : empList) {
					System.out.println(employee);
				}
				break;
				
			case 3:
				System.out.println("Enter the name to delete..");
				String nm=input.next();
				for(int i=0;i<empList.size();i++) {
					if((empList.get(i).getEmpName()).equals(nm)) {
						empList.remove(i);
						System.out.println("Record deleted successfully...");
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Record not found...");
					break;
				}
				break;
				
			case 4:
				System.out.println("Enter the 4.1>Name update\n4.2>Salary Update");
				int chs=input.nextInt();
				switch(chs) {
			 	case 1:
			 		System.out.println("Enter the old name to be update..");
			 		String nm1=input.next();
					for(int i=0;i<empList.size();i++) {
						
						if((empList.get(i).getEmpName()).equals(nm1)) {
							System.out.println("Enter the new name to be update....");
							String newName=input.next();
							empList.get(i).setEmpName(newName);
							System.out.println("Record updated successfully...");
							flag1=1;
							break;
						}
						
					}
					if(flag1==0) {
						System.out.println("Entered Name not found in Record...");
						break;
					}
			 		break;
			 		
			 	case 2:
			 		System.out.println("Enter the old salary....");
		
			 		
			 		break;
			 		
			 	default:
			 		System.out.println("Invalid choice for update....");
				}
				
			case5:
				System.out.println();
				
				break;
				
			default:
				System.out.println("Invalid Choice...");
				break;
			}
			
			System.out.println("Do you want to continue....");
			ch=input.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');

		System.out.println("I'm done");
	}

}

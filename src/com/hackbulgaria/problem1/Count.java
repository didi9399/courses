package com.hackbulgaria.problem1;

import java.util.Scanner;
public class Count {
	public boolean ExOh(String str) {
			 int countX = 0;
			 int countO = 0;
			 for(int i=0; i < str.length(); i++) {
				 if(str.charAt(i)=='o')
					 countX++;
					 else 
						 countO++;
				 }
			 if(countX==countO)
				 return true;
			 else
				 return false;
			 
	}
	
	public String str() {
			System.out.println("Insert string");
			Scanner s = new Scanner(System.in);
			String string = s.nextLine();
			for(int i = 0; i < string.length(); i++) 
				if(string.charAt(i) != 'o' && string.charAt(i) != 'x') {
					System.out.println("Insert string again");
					string = s.nextLine();
				}
			return string;
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Count a = new Count();
		 boolean bl = a.ExOh(a.str());
		 System.out.println(bl);
		 
	         }

     }


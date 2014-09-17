package com.hackbulgaria.problem3;

import java.util.Scanner;;
public class Oddnumber {

	public String dashInsert(int num) {
		StringBuilder str = new StringBuilder();
		int i = num;
		while( num > 0) {
			i = num % 10;
			num = num / 10;
			if(i % 2 != 0 && (num % 10) % 2 != 0)
				str.append(i+"-");
			else 
				str.append(i);
			}
		 String string = str.toString();
		
		return string;
		
	}
	
	public void reverseText(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--)
		sb.append(text.charAt(i));
		
		System.out.println(sb.toString());
		}
		
	public static void main(String[] args) {
	
		Oddnumber odd = new Oddnumber();
		
		odd.reverseText(odd.dashInsert(570764355));
		
	
	}
	
}

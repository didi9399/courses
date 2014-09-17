package com.hackbulgaria.problem2;

import java.lang.String;
public class count {
	 
		 
 public boolean ABCheck(String str){
	 
	 
	 int ii=0;
	 int indexA = str.indexOf('a');
	 int indexB = str.indexOf('b');
	 if(indexA>=0 && indexB>=0) {
		 if(indexB - indexA == 4 || indexA - indexB == 4)
			  ii=1;
		 else {
			 while( indexA!=-1 || indexB!=-1) {
				 indexA = str.indexOf('a', indexA+1);
				 indexB = str.indexOf('b', indexB+1);
					 if(indexB - indexA == 4 || indexA - indexB == 4)
						 ii = 1;
					 
				 }
					 
			 }
		 }
		 
	 if(ii==0)
		 return false;
	 else return true;
			
}
public static void main(String[] args) {
		 count aa = new count();
		 boolean b = aa.ABCheck("a  bsab    ");
		 System.out.println(b);
	
	}
}



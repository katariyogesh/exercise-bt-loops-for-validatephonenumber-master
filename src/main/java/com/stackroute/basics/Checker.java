package com.stackroute.basics;

import java.util.Scanner;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
public class Checker {
//	int length;
	Scanner value = new Scanner(System.in);
	 public static void main(String[] args) {

//	       //call the functions in the required sequence
	    	String phonenumber = new PhoneNumberValidator().getInput();
	    	int result = new PhoneNumberValidator().validatePhoneNumber(phonenumber);
	    	new PhoneNumberValidator().displayResult(result);
	    }

	    public String getInput() {
	    	String phonenumber = value.next();
	        return phonenumber;
	    }

	    public void displayResult(int result) {
	        //displays the result
	    	if(result==1) {
	    		System.out.println("valid");
	    	}
	    	else if(result==0) {
	    		System.out.println("invalid");
	    	}
	    }
	    int length;
	    int finalresult;
	    public int validatePhoneNumber(String input) {
	    	if(input == null || input =="") {
	    		finalresult=-1;
	    	}
	    	else {
	    		for(int j=0;j<input.length();j++) {
	    			if(((Character.isDigit(input.charAt(j))))){
	    					length++;
	    			}
	    		}
	    	
	    		
	    	
		    	if(input.matches("^[0-9-]*$")&& length == 10){
		    		//System.out.println();
		    		//System.out.println(phonenumber.charAt(i));
		    		finalresult=1;
		    
		    	}
		    	else {
		    			finalresult=0;
		    	}
	    	}
	        return finalresult;
	    }
	    public void closeScanner(){
	        //close the Scanner object
	    	value.close();
	    }
}
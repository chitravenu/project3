package test;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
    @SuppressWarnings("unused")
	int num1, num2,rem,temp;
    int sum=0;
    System.out.println("enter the two digit number");
     num1=sc.nextInt();
    temp=num1;
    while(num1>0) {
    	rem=num1%10;  //getting remainder
    	sum=(sum*10)+rem;
    	num1=num1/10;
    	
    }
    if(temp==sum)
    	System.out.println("the number is a palindrome number");
    else
    	System.out.println("the number is nt palindrome");
	}

}	
    	
    		
    		
    			
	



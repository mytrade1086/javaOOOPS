package com.javapgms;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		
		long num=12345;
		
		long rev=0;
		
		while(num!=0){
			
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		
		System.out.println(rev);
		
		
		
		
		//2 Soltion 2:
		
		long num2=4545;
		StringBuffer sb=new StringBuffer(String.valueOf(num2)).reverse();
		System.out.println(sb);
	}

}

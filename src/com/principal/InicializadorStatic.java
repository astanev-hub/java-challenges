package com.principal;

import java.util.Scanner;

public class InicializadorStatic {

	 public static boolean flag = true;
	 public static int b = 0;
	 public static int h = 0;
	 
	 static {
		 Scanner sc = new Scanner(System.in);
		 b = sc.nextInt();
		 h = sc.nextInt();
		 
		 if ((b > 0) && (h > 0)) {
			 flag = true;
		 } else {
			 flag = false;
			 System.out.println("java.lang.Exception: Breadth and height must be positive");
		 }
		 sc.close();

	 }

	 public static void main(String[] args){
		
		 if(flag){
			 int area=b*h;
			 System.out.print(area);
		 }
		
	 }//end of main

}//end of class
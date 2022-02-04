package com.principal;

import java.util.Scanner;

public class ImprimirValores {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
       
        int a, b = 0;

        if (y>x) {
        	a = x;
        	b = y;
        } else {
        	a = y;
        	b = x;
        }
        
        a++;
        while (a < b) {
        	if ((a%5 == 2) || (a%5 == 3)) {
        		System.out.println(a);
        	}
        	a++;
        }

    }
}
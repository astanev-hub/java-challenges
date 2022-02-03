package com.principal;

import java.io.IOException;
import java.util.Scanner;

public class SomaImpares {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int X, Y, soma;
    	int N = leitor.nextInt();
    	
    	int a = 0;
    	int b = 0;
    	
    	while(N>0) { 	
    		soma = 0;
    		X = leitor.nextInt();
    		Y = leitor.nextInt();
    		
    		if(X>Y) {
    			a = Y;
    			b = X;
    		} else {
    			a = X;
    			b = Y;
    		}
    		
    		a++;
    		while(a<b) {
    			if(a%2 != 0) {
    				soma += a;
    			}
    			a++;
    		}
    		
    		System.out.println(soma);
    		
    		N--;
    	}
    }
	
}
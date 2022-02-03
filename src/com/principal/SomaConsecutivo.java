package com.principal;

import java.io.IOException;
import java.util.Scanner;

public class SomaConsecutivo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        int soma=0, cont=0;
        for (int i = 0; i < N; i++) {
    		soma = 0;
    		X = leitor.nextInt();
    		Y = leitor.nextInt();
    		
        	while (cont < Y) {
        		if (X % 2 != 0) {
        			soma += X; 
        			cont++;
        		}
        		X++;
        	}
        	cont = 0;
        	System.out.println(soma);
        }
    }
	
}
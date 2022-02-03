package com.principal;

import java.io.IOException;
import java.util.Scanner;

public class CalculaMedia {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0, flag = 1;
		int valida = 0;
		
        while(flag==1) {
        	
        	while (valida == 0) {
            	nota1 = leitor.nextDouble();
            	if ((nota1 >= 0) && (nota1 <= 10)) {
            		valida = 1;
            	} else {
            		System.out.println("nota invalida");
            	}
        	}
        	
        	valida = 0;
        	while (valida == 0) {
            	nota2 = leitor.nextDouble();
            	if ((nota2 >= 0) && (nota2 <= 10)) {
            		valida = 1;
            	} else {
            		System.out.println("nota invalida");
            	}
        	}
        	
        	valida = 0;
        	media = ((nota1+nota2)/2);
        	System.out.printf("media = %.2f %n", media);
        	
        	while (valida == 0) {
            	System.out.println("novo calculo (1-sim 2-nao)");
            	
              	flag = leitor.nextDouble();
              	
              	if ((flag == 1) || (flag == 2)) {
              		valida = 1;
              	}
              	
        	}
        	valida = 0;
        
        }
		
		
		
    }
}
package com.principal;
import java.io.IOException;
import java.util.Scanner;

public class UmDoisTres {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n, aux=1;
		
		n = sc.nextInt();
		
		while (n > 0) {
			System.out.println(aux + " " + (aux + 1) + " " + (aux + 2) + " PUM");
			aux = aux + 4;
			n--;
		}
		
		sc.close();
	}
}
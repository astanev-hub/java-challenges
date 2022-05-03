package com.principal;

import java.io.IOException;
import java.util.Scanner;

public class Volley {
 
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) throws IOException {
 
     //a classe Scanner auxilia na leitura dos dados de entrada
     Scanner leitor = new Scanner(System.in);

		//TODO: Complete o código com uma solução possível

		int N = leitor.nextInt();          

		int[] dados =  new int[3];
		double bloqueiosAcertos = 0;
		double saquesAcertos = 0;
		double ataquesAcertos = 0;
		double bloqueiosTime = 0;
		double saquesTime = 0;
		double ataquesTime = 0;
		
		for (int i=0;i<N;i++) {
			
			//input para pegar o nome do jogador que não vai ser utilizado nos cálculos
			leitor.next(); 

			for (int j=0;j<3;j++) {
				dados[j] = leitor.nextInt();
			}
			bloqueiosTime+= dados[1];
			saquesTime+= dados[0];
			ataquesTime+= dados[2];
			
			for (int j=0;j<3;j++) {
				dados[j] = leitor.nextInt();
			}
			bloqueiosAcertos+= dados[1];
			saquesAcertos+= dados[0];
			ataquesAcertos+= dados[2];
		}
		double bloqueios = (bloqueiosAcertos * 100) / bloqueiosTime;
		double saques = (saquesAcertos * 100) / saquesTime;
		double ataques = (ataquesAcertos * 100) / ataquesTime;
		System.out.println(String.format("Pontos de Saque: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
 
    }
 
}
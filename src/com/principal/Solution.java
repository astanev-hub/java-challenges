package com.principal;

import java.util.*;
public class Solution{
     
// Abaixo segue um exemplo de código que você pode ou não utilizar

    //função para checar altura
    public static int heightChecker(int[] heights) {

	//TODO: Complete o código com uma solução possível

      
	//ordene o array (você pode utilizar algum método da classe de Arrays)

    	int[] esperado = new int[heights.length];
    	int contador = 0;
    	
    	esperado = heights.clone();
    	
    	Arrays.sort(esperado);
    	
        for(int i=0;i<heights.length;i++){
        	if (heights[i] != esperado[i]) {
        		contador+= 1;
        	}
        }
    	
        return contador;
     
    }

public static void main(String[] args)
{ 
    
    //a classe Scanner auxilia na leitura dos dados de entrada
    Scanner input = new Scanner(System.in);
    
      int tamanho = input.nextInt();
      int[] heights = new int[tamanho];
    
      //preenchendo o array de alturas com as entradas
      for(int i=0;i<tamanho;i++){
    	  heights[i] = input.nextInt();
        }
    
 
    System.out.println(heightChecker(heights));
}
}
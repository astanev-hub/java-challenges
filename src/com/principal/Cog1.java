package com.principal;

import java.util.*;

public class Cog1
{
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args)
    {
       //a classe Scanner auxilia na leitura dos dados de entrada
       Scanner input = new Scanner(System.in);
       
        int ano, seculo;
    
        // hasNext é um método da classe Java Scanner que retorna true se tiver outra entrada
        while (input.hasNext()) {
            
        //TODO: Complete o código com uma solução possível
        	ano = input.nextInt();
        	
        	if (ano < 101) {
        		seculo = 1;
        	} else {
        		if (ano % 100 == 0) {
        			seculo = ano / 100;
        		} else {
            		seculo = (ano/100) + 1;
        		}
        	}
    
        	System.out.println(seculo);
       
        
    }
    }
}
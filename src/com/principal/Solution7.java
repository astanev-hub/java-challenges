package com.principal;

import java.util.Scanner;

public class Solution7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0;
        int b=0;
        int n=0;

        double calc1 = 0;
        double calcAnt = 0;
        
        int[][] m = new int [t][3]; 
        
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            m[i][0] = a;
            m[i][1] = b;
            m[i][2] = n;
        }
        
        
        for (int i=0; i<t;i++) {
        
        	calc1 = (m[i][0] + (Math.pow(2, 0) * m[i][1]));
        	calcAnt = calc1;
		
        	System.out.printf("%.0f ", calc1);

        	for (int j=1; j<m[i][2]; j++) {
        		double exp = Math.pow(2, j);
        		calcAnt = (calcAnt + (exp * m[i][1]));
        		System.out.printf("%.0f ", calcAnt);
        	}
        	
        	System.out.printf("%n");
        	calc1 = 0;
        	calcAnt = 0;
        
        }
        
        in.close();
    }
}

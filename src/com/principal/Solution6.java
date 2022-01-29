package com.principal;

import java.io.*;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i=1; i<11; i++) {
        	System.out.printf("%d x %d = %d%n",n,i,(n * i));
        }

        bufferedReader.close();
    }
}

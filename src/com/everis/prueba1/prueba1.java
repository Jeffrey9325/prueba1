package com.everis.prueba1;

import java.util.Scanner;

public class prueba1 {



    public static void main(String[] args) {
//    	Scanner scanner=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d%n",s1,x); 
//        }
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        for(int i=1;i<11;i++)
//        {
//        	 System.out.printf("%d x %d = %d%n", N, i, N * i); 
//        }
    	Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int e=0;e<n;e++) {
            	 sum += (Math.pow(2, e) * b);
            	 System.out.printf("%d ", sum);
                 //System.out.print(sum + " ");
//            	result = a + (2^e) * b;
//            	 System.out.print(result + " ");
            }
            //System.out.print(result);
            System.out.println();
            
//            2
//            0 2 10 5 3 5
//            2 6 14 30 62 126 254 510 1022 2046 
//            8 14 26 50 98 
            
        }
        in.close();
        System.out.println("cambio2");
        
        
        
        
//        System.out.println("================================");
    }

}

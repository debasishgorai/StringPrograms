package p1;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter num");
	        int n = sc.nextInt();
	        int st = 1;
	        for (int i = 1; i <= n; i++){
	            for (int j = 1; j <= st; j++){
	                System.out.print("*");
	            }
	            if (i <= n /2){
	                st++;
	            }
	            else {
	                st--;
	            }
	            System.out.println();
	        }
	    
	        
	      
	
	}

}

package atv_03_05;

import java.util.Scanner;

public class SerieFat_02 {
	
	public static  float fatorial(int n){
		if(n == 0)
			return 1;
		return n*fatorial(n-1);
	}
	
	public static float s(int n){
		if(n==1)
			return 1;
			else{
			return 1/fatorial(n) + s(n-1);
		}
	}
	
	public static void main(String[]args){
		
		Scanner ler = new Scanner(System.in);

		SerieFat_02 objt = new SerieFat_02();
		
	    int n;
	    
	    System.out.printf("Digite uma numero para calcular a serie:  \n");
	    n = ler.nextInt();
	   
	    System.out.printf("Result: %.2f \n",objt.s(n));

		}
	}

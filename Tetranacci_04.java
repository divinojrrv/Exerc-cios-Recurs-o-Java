package atv_03_05;
import java.util.*;


public class Tetranacci_04 {

	public static int tetranacci(int n) {
		
		if(n == 0 || n == 1 || n == 2) {
			return 0;
		}
		
		if(n == 3) {
			return 1;
		}
		return tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
	}
	
	
public static void main(String args[]){
	
	Tetranacci_04 objt = new Tetranacci_04();
	Scanner ler = new Scanner(System.in);
	
	int n;

    System.out.printf("Informe a posicao da sequencia de tetranacci que deseja ver:  \n");
    n  = ler.nextInt();
    
    
    System.out.printf("Numero da sequencia %d e = %d  \n",n,objt.tetranacci(n));

	}
}
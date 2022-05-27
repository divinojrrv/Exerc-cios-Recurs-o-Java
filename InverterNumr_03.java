package atv_03_05;
import java.util.*;


public class InverterNumr_03 {

	public static int invertenumr(int n, int total) {

		if(n == 0) 
			return total;
		else 
			return invertenumr(n/10, total * 10 + n % 10);
		
	}
	
public static void main(String args[]){
	
	InverterNumr_03 objt = new InverterNumr_03();
	Scanner ler = new Scanner(System.in);
	
	int n;

    System.out.printf("Informe um numero:  \n");
    n  = ler.nextInt();
    
    System.out.printf("Numero invertido de %d e = %d  \n",n,objt.invertenumr(n,0));

	}
}
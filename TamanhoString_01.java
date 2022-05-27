package atv_03_05;
import java.util.*;


public class TamanhoString_01 {
	
	int i = 0;
	
		public int tamanho(String s) {
			
			if(s.equals("")) 
				return 0;
	
			return tamanho(s.substring(i+1)) + 1;
		}
	
	public static void main(String[]args){
		
		Scanner ler = new Scanner(System.in);

		TamanhoString_01 objt = new TamanhoString_01();
		
	    String palavra;
	    
	    System.out.printf("Digite uma palavra para saber seu tamanho:  \n");
	    palavra  = ler.nextLine();
	   
	    System.out.printf("Tamanho: %d \n",objt.tamanho(palavra));

		}
	}
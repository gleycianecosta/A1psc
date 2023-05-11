package q10;

import java.util.Scanner;

public class menoresdeidade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      int idade, totalMenores = 0, cont = 1 ;
      
      do {
    	  System.out.print("Informe a idade da pessoa " + cont + ": ");
          idade = input.nextInt();
          if(idade < 18 ) {
        	  totalMenores++;
          }
    	  cont++;
      } while (cont <= 10);
      System.out.println("total de menores é " + totalMenores);
}
}

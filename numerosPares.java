package q10;

import java.util.Scanner;




public class numerosPares {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int num;
	        do {
	            System.out.print("Informe um número inteiro maior que 20: ");
	            num = input.nextInt();
	        } while (num <= 20);

	        System.out.println("Números pares de 2 até " + num + ":");
	        for (int i = 2; i <= num; i += 2) {
	            System.out.println(i);
	        }
	    }

}

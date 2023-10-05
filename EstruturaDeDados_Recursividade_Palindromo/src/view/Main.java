package view;
import java.util.*;

import controller.Controle;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Num: ");
		int num=sc.nextInt();
		
		Controle controle=new Controle();
		int palindromo=controle.palindromo(num,0);
		System.out.print("Resultado: "+palindromo+", ");
		boolean condicao=controle.condicao(num,palindromo);
		
		System.out.print(condicao ? "Palindromo" : "N e palindromo");
	}
}

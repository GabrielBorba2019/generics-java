package application;

import java.util.Scanner;

import model.services.PrintService;

public class ProgramString {
public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		//<Tipo generics> da cole��o
		//Type safefy do generic garante que sera retornado um String
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}
		
}

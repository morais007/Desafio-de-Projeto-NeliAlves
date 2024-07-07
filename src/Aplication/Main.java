package Aplication;

import java.util.Locale;
import java.util.Scanner;

import ContaBancaria.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta;
	
		System.out.print("Insira o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		String nome = sc.next();
		System.out.print("Existe depósito inicial (y/n)? ");
		
		char opcao = sc.next().charAt(0);
		if(opcao == 'y') {
			System.out.print("Insira o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, depositoInicial);
		}
		else {
			conta= new ContaBancaria(numero,nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Insira um valor de depósito: ");
		double quantidade = sc.nextDouble();
		conta.Deposito(quantidade);
		System.out.println("Dados da conta atualizados: ");
		System.out.print(conta);
		System.out.println();
		
		System.out.print("Insira um valor de saque: ");
		quantidade = sc.nextDouble();
		conta.Saque(quantidade);
		System.out.println(conta);
	
		
		
		
		sc.close();

	}

}

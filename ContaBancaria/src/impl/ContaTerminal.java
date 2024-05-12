package impl;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import model.Conta;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("---------- Bem vindo ----------");
		try {
			System.out.println("---------- Abrindo conta ----------");
			System.out.println("Nome do cliente: ");

			conta.setNomeCliente(scan.next());
			
			System.out.println("Numero da conta: ");
			
			conta.setNumero(scan.nextInt());
			
			System.out.println("Numero da agencia: ");
			
			conta.setAgencia(scan.next());
			
			System.out.println("Deseja fazer um depósito? S/N ");
			
			if(scan.next().matches( "(?i)Sim|S")) {
				
				System.out.println("Quanto deseja depositar? (ex: 50.00 )");
				conta.depositar(scan.nextDouble());
			}
				
			System.out.printf("Olá %s,"
					+ " obrigado por criar uma conta em nosso banco,"
					+ " sua agência é %s, conta %d"
					+ " e seu saldo %.2f já está disponível para saque\"."
					, conta.getNomeCliente().toUpperCase(), conta.getAgencia().toLowerCase(), conta.getNumero()
					, conta.getSaldo());
			
			
		}catch(MissingFormatArgumentException e) {
			
			System.out.println(e.toString() + "/n --- Formato inválido ---");
			
		}catch(InputMismatchException e) {
			
			System.out.println(e.toString() + "/n --- Entrada inválida ---");
			
		}catch(NullPointerException e) {
			
			System.out.println(e.toString() + "/n --- Entrada inválida ---");
			
		}
		
		
		
	
		scan.close();
	}
	

}

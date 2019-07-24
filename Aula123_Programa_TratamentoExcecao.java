package Seção_10_Tratamento_de_exceções;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
 * ao limite de saque da conta.
 */

public class Aula123_Programa_TratamentoExcecao {

	public static void main(String[] args) {

		Scanner Ler = new Scanner(System.in);
		DecimalFormat result = new DecimalFormat("00.00");
		try {
			System.out.println("Enter account data: ");
			System.out.print("Numer: ");
			int number = Ler.nextInt();
			Ler.nextLine();
			System.out.print("Holder: ");
			String holder = Ler.nextLine();
			System.out.print("Initial balance: ");
			double balance = Ler.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = Ler.nextDouble();
			Aula123_TratamentoExcecao input = new Aula123_TratamentoExcecao(number, holder, balance, withdrawLimit);

			System.out.println();

			System.out.print("Enter amount for withdraw: ");
			double cashWithdrawal = Ler.nextDouble();
			input.withDraw(cashWithdrawal);
			System.out.println("New Balance: " + result.format(input.getBalance()));

		} catch (Aula123_Excecoes e) {
			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("Incorrect parameter" );

		}
		Ler.close();
	}

}

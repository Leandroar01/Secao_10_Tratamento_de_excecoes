package Se��o_10_Tratamento_de_exce��es;

import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de uma conta banc�ria e depois realizar
 * um saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode
 * ocorrer ou se n�o houver saldo na conta, ou se o valor do saque for superior
 * ao limite de saque da conta.
 */

public class Aula123_Programa_TratamentoExcecao {

	public static void main(String[] args) {

		Scanner Ler = new Scanner(System.in);

		System.out.println("Enter account data: ");
		System.out.print("Numer: ");
		int number = Ler.nextInt();
		System.out.print("Holder: ");
		String holder = Ler.nextLine();
		System.out.print("Initial balance: ");
		double balance = Ler.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = Ler.nextDouble();
		Aula123_TratamentoExcecao input = new Aula123_TratamentoExcecao(number, holder, balance, withdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double cashWithdrawal = Ler.nextDouble();
		try {
			input.withDraw(cashWithdrawal);

		} catch (Aula123_Excecoes e) {
			System.out.println(e.getMessage());

		}
		Ler.close();
	}

}

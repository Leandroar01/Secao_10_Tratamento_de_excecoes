package Seção_10_Tratamento_de_exceções;

public class Aula123_TratamentoExcecao {

	private int number;
	private String holder;
	private double balance;
	private double dailywithdrawLimit;

	public Aula123_TratamentoExcecao() {

	}

	public Aula123_TratamentoExcecao(int number, String holder, double balance, double dailywithdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.dailywithdrawLimit = dailywithdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getwithdrawLimit() {
		return dailywithdrawLimit;
	}

	public void setwithdrawLimit(double withdrawLimit) {
		this.dailywithdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withDraw(double amount) throws Aula123_Excecoes {

		if (amount > dailywithdrawLimit) {
			throw new Aula123_Excecoes("Withdraw error: The amount exceeds withdraw limit");

		} else if (amount > balance) {
			throw new Aula123_Excecoes("Withdraw error: Not enough balance");
		} else {
			balance -= amount;
		}
	}
}

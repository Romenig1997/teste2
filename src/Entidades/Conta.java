package Entidades;

public class Conta {
	private int numeroDaConta;
	private String nomeDoCliente;
	private double saldo;
	private double depositoInicial;

	public Conta(int numeroDaConta, String nomeDoCliente, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
		deposito(depositoInicial);
	}

	public Conta(int numeroDaConta, String nomeDoCliente) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public double deposito(double deposito) {
		return saldo += deposito;
	}

	public double saque(double saque) {
		return saldo -= saque + 5.0;
	}

	public String toString() {
		return "Account " + numeroDaConta + ", Holder: " + nomeDoCliente + ", Balance: $ "
				+ String.format("%.2f", saldo);
	}

}

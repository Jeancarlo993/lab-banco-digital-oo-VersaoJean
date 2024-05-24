package model;


public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;

	protected int numero;
	protected double saldo;

	public Conta() {
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}

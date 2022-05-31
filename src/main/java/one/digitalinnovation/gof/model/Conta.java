package one.digitalinnovation.gof.model;

import javax.persistence.Id;

public class Conta {
    
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    @Id
    protected int numero;
    protected int agencia;
	protected double saldo;
	protected Cliente cliente;



    public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}



    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    
}

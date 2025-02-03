package Entities;

public class Conta {
	private String nome;
	private int numero;
	private Double saldo;
	private Double cheque;
	
	
	
	
	
	
	
	
	
	public Conta() {	
	}

	
	public Conta(int numero, String nome, double saldo ) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.cheque = valorCheque();
	}
	
	
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Double getSaldo() {
		return saldo;
	}
	

	public Double getCheque() {
		return cheque;
	}

	
	public void deposito(double valor) {
		if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            
           
            if (usandoCheque()) {
                cobrarTaxaChequeEspecial();
            }
        } else {
            System.out.println("Depósito não realizado! Valor inválido.");
        }
		
	}
	
	public boolean saque(double valor) {
		double limiteDisponivel = this.saldo + this.cheque;
		
		if (getSaldo() > 0 && getSaldo() <= limiteDisponivel) {
			this.saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
			return true;
		}	
		else {
			System.out.println("Saldo insuficiente! O saque ultrapassa o limite disponível.");
			return false;
		}
		
	}
	
	public void pagarBoleto(int numero, double valor) {
		if(valor <= getSaldo()) {
			System.out.println("Pagamento realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente para pagamento do boleto.");
			System.out.println("Saldo: " + getSaldo());
		}
	}
	
	
	public double valorCheque() {
		if(getSaldo() <= 500) {
			return this.cheque = 50.00;
		}
		else {
			return this.cheque = saldo * 0.5;
		}
	}
	
	public boolean usandoCheque() {
		return this.saldo < 0;
		
	}
	
	private void cobrarTaxaChequeEspecial() {
        if (saldo < 0) {
            double taxa = saldo * 0.2;
            saldo += taxa; 
            System.out.println("Taxa de 20% sobre cheque especial cobrada: R$ " + Math.abs(taxa));
        }
	}
}

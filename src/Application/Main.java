package Application;

import java.util.Scanner;

import Entities.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = sc.nextDouble();
        Conta conta = new Conta(1, "Wilson Gomes", depositoInicial);
		
		
		
		
		int opcao;
		do {
            System.out.println("\n====== MENU DO BANCO ======");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar Uso do Cheque Especial");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Limite do cheque especial: R$ " + conta.getCheque());
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    double boleto = sc.nextDouble();
                    conta.pagarBoleto(1478541, boleto);
                    break;
                case 6:
                    if (conta.usandoCheque()) {
                        System.out.println("A conta está usando cheque especial!");
                    } else {
                        System.out.println("A conta NÃO está usando cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
				
				
				
				
		sc.close();
	}

}

package filipe.pugliesi;

import java.util.Random;
import java.util.Scanner;

public class Transacoes {                // Classe para realizar as transações.
    private boolean executarTransacoes;
    private Scanner scanner;
    private Conta conta;

    public void executar() {
        int opcao;
        while (executarTransacoes) {
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {        // Programação de como o sistema deve responder às opções escolhidas pelo usuário.
        switch (opcao) {
            case 0:  // Encerra o programa quando o usuário o solicita.
                System.out.println("Obrigado por escolher o MauaBank!");
                this.executarTransacoes = false;
                break;
            case 1:    // Exibe saldo.
                System.out.println("Saldo Atual: R$" + this.conta.getSaldo());
                break;
            case 2:   // Realiza as transferências para outra conta.
                System.out.println("Quanto deseja transferir?");
                double quantiaParaTransferir = scanner.nextDouble();
                if (this.conta.transferir(quantiaParaTransferir)) {
                    System.out.println("Operação Realizada com Sucesso!");
                } else {
                    System.out.println("Não foi possível realizar a operação!");
                }
                break;
            case 3:   //Gera código para recebimento
                System.out.println("Aguarde a geração do código.");
                double gerarcodigo = scanner.nextDouble();
                this.conta.gerar(gerarcodigo);
                System.out.println("Operação Realizada com Sucesso!");
                break;
            case 4:  //Paga conta
                System.out.println("Nome da Conta:");
                String nome = scanner.next();
                System.out.println("Valor da conta:");
                double valorDaConta = scanner.nextDouble();
                System.out.println("Juros da conta:");
                double jurosDaConta = scanner.nextDouble();
                System.out.println("Informe a data de vencimento (ano-mes-dia)?");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorDaConta, nome, dataVencimentoTitulo, jurosDaConta);
                if (this.conta.sacar(titulo.totalParaPagar())) {
                    System.out.println("Operação Realizada com Sucesso!");
                } else {
                    System.out.println("Ocorreu Algum Erro Inesperado!");
                }
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }

    public Transacoes() {
        this.scanner = new Scanner(System.in);       //Permite a leitura de entrada do sistema - via teclado.
        this.executarTransacoes = true;
        this.conta = new Conta("Zenón Barriga y Pesado", 1400, 1234);
    }

    private void exibirMenu() {             //Exibe o menu.
        System.out.println("Bem Vindo ao MauáPagar!");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Realizar Transferências");
        System.out.println("3 - Gerar Código de Recebimento");
        System.out.println("4 - Pagar Conta (Título)");
        System.out.println("0 - Encerrar");
    }
}

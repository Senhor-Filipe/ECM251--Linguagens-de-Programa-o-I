package filipe.pugliesi;

public class Conta {
    //Dados da classe (os dados da conta devem estar inseridos para serem processados)
    private Usuario usuario;
    private double saldo;
    private int numero;

    public Conta(String nome, double saldoInicial, int numero) {
        this.saldo = saldoInicial;
        this.numero = numero;
        this.usuario = new Usuario(nome);
    }

    //Funcionamento da classe
    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Cliente Bancário=" + usuario.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

    public boolean transferir(double quantiaParaTransferir) {
    }

    public void gerar(double gerarcodigo) {
    }
}

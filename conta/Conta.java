package conta;

public class Conta{

    double saldoConta;
    String numeroConta;
    String titularConta;
    int agenciaConta;
    int bancoConta;

    Conta(double saldoConta, String numeroConta, String titularConta, int agenciaConta, int bancoConta){

        this.saldoConta = saldoConta;
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.agenciaConta = agenciaConta;
        this.bancoConta = bancoConta;

    }
}
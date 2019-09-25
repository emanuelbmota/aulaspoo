package conta;

public class TesteConta{

    public static void main(String[] args){

        Conta c1 = new Conta(2000.97, "50555", "Emanuel", 5, 6);
        System.out.println("Olá Senhor(a) "+c1.titularConta+" seu saldo é de R$"+c1.saldoConta+" na conta "+c1.numeroConta+" e sua agencia é "+c1.agenciaConta+" no banco "+c1.bancoConta);

    }
}
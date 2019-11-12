package imovel;

public class Novo extends Imovel{

    Novo(String endereco, double preco){
        super(endereco, preco);
    }

    public double PrecoAdicional(double preco){

        return this.preco = this.preco + (preco * 0.3); 
     }

    }

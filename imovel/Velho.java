package imovel;

public class Velho extends Imovel{

    Velho (String endereco, double preco){
        super(endereco, preco);
    }
    public double Desconto(double preco){
        
        return this.preco = this.preco - (preco * 0.1);
    
    }
}
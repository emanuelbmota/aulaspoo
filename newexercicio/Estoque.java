package newexercicio;

public class Estoque{

    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    

    Estoque(String nome, int qtdAtual, int qtdMinima){
        
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;

    }
    public Estoque(){

    }

    void mudarNome(String nome){
        this.nome = nome;
    }

    void mudarQtdMinima(int qtdMinima){
        if(qtdMinima > 0){
        this.qtdMinima = qtdMinima;
        }
    }

    void repor(int qtd){
        if(qtd > 0){
        this.qtdAtual += qtd;
    }
    }

    void darBaixa(int qtd){
        int valorbaixa = this.qtdAtual;
        if(qtd > 0 && (valorbaixa -= qtd) >= 0){
        this.qtdAtual -= qtd;
    }
    else{

    }
    }
    
    String mostra(){
        return ("O nome do produto é: "+this.nome +"\nSua quantidade mínima é de: " + this.qtdMinima + "\nSua quantidade atual é de: "+ this.qtdAtual);
    }

    boolean precisaRepor(){
        if(this.qtdAtual <= this.qtdMinima && qtdMinima != 0){
            return true;
        }
        else{
            return false;
        }
    }

    void reporValor(){
        this.qtdAtual = this.qtdMinima;
    }
}
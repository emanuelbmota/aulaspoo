package produto;

//Código eu

public class Produto{

    String descricao, marca;
    double preco;

    void Produto(double preco, String descricao, String marca){

        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;

    }
    String getDescricao(){
        return this.descricao;
    }

    void setDescricao(String descricao){
        this.descricao = descricao;
    }

    String getMarca(){
        return this.marca;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    double getPreco(){
        return preco;
    }

    void alterarPreco(double novoPreco){
        if (novoPreco > 0){
            this.preco = novoPreco;
        }
    } 

    void aumentarPreco(double porcentagem){
        if (porcentagem > 0){
            System.out.println("Aumentando o preço em "+ porcentagem + " %");
            porcentagem = 1 + (porcentagem/100);
            preco *= porcentagem;
            System.out.println("Novo preço = " + preco);
        }
        else{
            System.out.println("Aumento deve ser maior do que zero");
        }
    }

    void imprime(){

        System.out.println("---------------------");
        System.out.println("Produto : " + descricao);
        System.out.println("Marca : " + marca);
        System.out.println("Preco : " + preco);
        System.out.println("---------------------");
    }


}
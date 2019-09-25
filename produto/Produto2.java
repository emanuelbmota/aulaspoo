package produto;

//Código livro

public class Produto2{

    String descricao, marca;
    double preco;

    void ValoresIniciais(double umPreco, String umaDescricao, String umaMarca){

        alterarPreco(umPreco);
        setDescricao(umaDescricao);
        setMarca(umaMarca);

    }
    String getDescricao(){
        return descricao;
    }

    void setDescricao(String novaDescricao){
        descricao = novaDescricao;
    }

    String getMarca(){
        return marca;
    }

    void setMarca(String novaMarca){
        novaMarca = marca;
    }

    double getPreco(){
        return preco;
    }

    void alterarPreco(double novoPreco){
        if (novoPreco > 0){
            preco = novoPreco;
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
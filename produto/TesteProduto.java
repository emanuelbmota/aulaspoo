package produto;

public class TesteProduto{

    public static void main(String []args){

        Produto2 p1 = new Produto2();

        p1.ValoresIniciais(9.0, "Produto X", "Marca Y");
        p1.imprime();
        p1.aumentarPreco(10);
        p1.setDescricao("Casual Class");
        p1.setMarca("GlobalCode");
        p1.imprime();

    }
}
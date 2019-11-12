package imovel;

public class TesteImovel{

    public static void main(String[] args){

        Imovel i = new Imovel("Casa 01", 1000);
        
        Novo n = new Novo("Casa 02", 1000);

        Velho v = new Velho("Casa 03", 1000);
        System.out.println(n.PrecoAdicional(150));
        System.out.println(v.Desconto(150));


    }
}
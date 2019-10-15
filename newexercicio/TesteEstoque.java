package newexercicio;

public class TesteEstoque{
    public static void main(String[] args){

        Estoque e1 = new Estoque("Impressora Jato de Tinta", 13, 6);

        Estoque e2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);

        Estoque e3 = new Estoque("Mouse Ótico", 6, 2);
        
        e1.darBaixa(5);
        e2.repor(7);
        e3.darBaixa(6);
        
        if(e1.precisaRepor()){
            System.out.println("Precisa repor Impressora Jato de Tinta\n");
        }
        else{
            System.out.println("Não precisa repor!!\n");
        }

        
        if(e2.precisaRepor()){
            System.out.println("Precisa repor Monitor LCD 17 Polegadas\n");
        }
        else{
            System.out.println("Não precisa repor!!\n");
        }


        if(e3.precisaRepor()){
            System.out.println("Precisa repor Mouse Ótico\n");
        }
        else{
            System.out.println("Não precisa repor!!\n");
        }


        System.out.println(e1.mostra());
        System.out.println("\n"); 
        System.out.println(e2.mostra());
        System.out.println("\n"); 
        System.out.println(e3.mostra());

    }
}
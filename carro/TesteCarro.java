package carro;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro c1 = new Carro(50.0f, 50.0f, 2.0f);
        c1.passeio(100);
        System.out.println("\n");
        c1.encheTanque(10);
        System.out.println("\n");
        c1.passeio(50);
        System.out.println("\n");
        c1.encheTanque(60);
        System.out.println("\n");
    }
    
}

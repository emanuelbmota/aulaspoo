package carro;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro c1 = new Carro(50.0f, 40.0f, 1.0f);
        c1.passeio(99);
        System.out.println("\n");
        c1.encheTanque(11);
        System.out.println("\n");
        c1.passeio(50);
        System.out.println("\n");
        c1.encheTanque(60);
        System.out.println("\n");
    }
    
}

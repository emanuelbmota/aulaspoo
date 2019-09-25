package balde;

public class TesteBalde {

    public static void main(String[] args) {
    
        Balde b = new Balde("Plástico", 1000, 700 );
        
        
        if(b.poe(500))
            System.out.println("Operação realizada");
        
        else
            System.out.println("Operação não realizada");
        
        if(b.tira(700))
            System.out.println("Operação realizada");
        else
            System.out.println("Operação não realizada");
        
    }
}
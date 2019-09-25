package pessoa;

public class TesteAnimal {
    
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        a1.setTamanho(1.80f);
        System.out.println(a1.getTamanho());        
        a1.setCor("Marrom");
        System.out.println(a1.getCor());
        
      
    }
    
}

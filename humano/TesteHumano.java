package humano;

public class TesteHumano {
    
    public static void main(String[] args) {
        
        Humano h1 = new Humano("Emanuel ", 19, 1.80, 69.9, "Masculino");
        System.out.println("Voce tem "+h1.getAltura()+" de altura e pesa "+ h1.getPeso()); 
        System.out.println("De acordo com esses dados seu IMC é de "+h1.analisaIMC());
      
    }
    
}

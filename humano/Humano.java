package humano;

public class Humano {
    
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    
    public Humano(String nome, int idade, double altura, double peso, String sexo){
        
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String analisaIMC(){
        
        if (calcIMC() <= 18.5){
            return ("Abaixo do peso");
        }
        else if (calcIMC() >= 18.5 && calcIMC() < 25){
            return ("Peso normal");
        }
        
        else if (calcIMC() >= 25 && calcIMC() < 30){
            return("Sobrepeso");
        }
        else if (calcIMC() >= 30 && calcIMC() < 35){
            return("Obesidade grau 1");
        }
        else if (calcIMC() >= 35 && calcIMC() < 40){
            return("Obesidade grau 2");
        }
        else{
            return("Obesidade grau 3");
        }
    }   
    
    private double calcIMC(){
        
        return(this.peso/(this.altura * this.altura));
        
        
    }
    
}

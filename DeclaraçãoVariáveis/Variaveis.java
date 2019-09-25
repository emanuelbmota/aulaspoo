package DeclaraçãoVariáveis;

public class Variaveis {
    
    private String name;
    private int idade;
    private String RG;
    private char sexo;
    private double salario;

    Variaveis(String name, int idade, String RG, char sexo, double salario){

        this.name = name;
        this.idade = idade;
        this.RG = RG;
        this.sexo = sexo;
        this.salario = salario;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getRG(){
        return RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


}
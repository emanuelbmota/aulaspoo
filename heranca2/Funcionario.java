package heranca2;

public class Funcionario{

    protected int matricula;
    protected String nome;
    protected double salario;


    public void setMatricula(int matricula){
        this.matricula = matricula;

    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void calcBonus(){

        this.salario = this.salario * 1.03;
    }

    public double getSalario(){
        return this.salario;
    }

}



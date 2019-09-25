package funcionario2;

public class Funcionario {
    
    private int codFUncionario;
    public String nomeFuncionario;
    protected int foneFuncionario;

    Funcionario(String nomeFuncionario, int foneFuncionario){

        codFUncionario = 0;
        this.foneFuncionario = foneFuncionario;
        this.nomeFuncionario = nomeFuncionario;

    }

    //método registrar ponto
    public boolean registarPonto(){

        return(true);
    }
    
    public int Codfuncionario(){
        
        return(this.codFUncionario);
        
    }
}

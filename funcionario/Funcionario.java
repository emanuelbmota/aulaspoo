public class Funcionario {
    
    String nome;
    double valorhora;
    double qtdhora;
    
    Funcionario(String nome, double valorhora, double qtdhora){
        
        this.valorhora = valorhora;
        this.nome = nome;
        this.qtdhora = qtdhora;
        
    } 
    
    double salario(){
        
        return (this.valorhora*this.qtdhora);
    }    
}
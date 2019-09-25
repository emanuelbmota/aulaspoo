package elevador;

public class Elevador {
    
    private int totalAndar;
    private int andarAtual = 1;
    private int capacidade;
    private int pessoas;
    
    Elevador(int totalAndar, int capacidade){
        
        this.totalAndar = totalAndar;
        this.andarAtual = andarAtual;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
        
    }
    public boolean entra(int p){
        
        if ((this.pessoas += p) <= this.capacidade ){
            return(true);
        }
        else{
            return(false);
        }
    }
    public boolean sai(int p){
        
        if ((this.pessoas -= p) <= this.capacidade && this.pessoas > 0){
            return(true);
        }
        else{
            return(false);
        }
    }
    public boolean sobe(int a){
       
        if ((this.andarAtual += a) >= 1 && this.andarAtual < this.totalAndar){
            return(true);
        }
        else{
            return(false);
        }
    }
    public boolean desce(int a){
        if ((this.andarAtual -= a) <= totalAndar && this.andarAtual >= 2){
            return(true);
        }
        else{
            return(false);
        }
    }
    public int statusElevador(){
        return(this.andarAtual);
    }
    public int statusPessoas(){
        return(this.pessoas);
    }
}
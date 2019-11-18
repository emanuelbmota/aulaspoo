package autor;

public class Autor{

    private int codigo;
    private String nome;

    public Autor(int codigo, String nome){

        this.codigo = codigo;
        this.nome = nome;
        
    }

    public String getNome(){
        return nome;
    }
}
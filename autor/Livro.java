package autor;

public class Livro{

    private int codigo;
    private String titulo;
    private Autor autor;

    public Livro(int codigo, String titulo, Autor autor){

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;

    }

    public int getCodigo(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public String getNomeAutor(){
        return autor.getNome();
    }

    public String show(){
        return "\nCódigo: "+this.getCodigo() + "\nTítulo: "+this.getTitulo() + "\nAutor: " + this.getNomeAutor();
    }
}
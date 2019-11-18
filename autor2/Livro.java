package autor2;

public class Livro{

    private int codigo;
    private String titulo;
    private Autor[] autor;
    private int numAutor=2;

    public Livro(int codigo, String titulo, Autor[] autor){

        this.autor = new Autor[numAutor];
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
        String lista="";
        for(Autor i : autor){
            lista += i.getNome() + "\n\t";
        }
        return lista;
    }

    public String show(){
        return "\nCódigo: "+this.getCodigo() + "\nTítulo: "+this.getTitulo() + "\nAutor(es): " + this.getNomeAutor();
    }
}
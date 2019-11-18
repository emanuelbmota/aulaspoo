package autor;

public class testaLivro{

    public static void main(String[] args){

        Autor a = new Autor(9, "Eduardo Bueno");
        Livro l = new Livro(1, "A Viagem do Descobrimento", a);

        System.out.println(l.show());
    }
}
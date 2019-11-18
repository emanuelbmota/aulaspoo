package autor2;

public class testaLivro{

    public static void main(String[] args){

        Autor a = new Autor(9, "Eduardo Bueno");
        Autor b = new Autor(8, "J.C. Maldonado");
        Autor[] autores = {a,b};
        Livro l = new Livro(1, "A Viagem do Descobrimento", autores);

        System.out.println(l.show());
    }
}
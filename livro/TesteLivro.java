public class TesteLivro {

    public static void main(String[] args) {
        
        Livro l1 = new Livro("Clean code", 400, 20);
        System.out.println(l1.paginaAtual());
        l1.avancarPagina();
        System.out.println(l1.paginaAtual());
        l1.voltarPagina();
        System.out.println(l1.paginaAtual());
    }
    
}

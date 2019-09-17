public class Livro {
    
    String titulo;
    int paginaAtual;
    int numPaginas;
    
    Livro(String titulo, int numPaginas, int paginaAtual){
        
        this.titulo = titulo;
        this.paginaAtual = paginaAtual;
        this.numPaginas = numPaginas;
    }
    
    void avancarPagina(){
        if(this.paginaAtual < this.numPaginas){
            this.paginaAtual += 1;
        }
    }
    
    void voltarPagina(){
        if(this.paginaAtual <= this.numPaginas && this.paginaAtual >= 2){
            this.paginaAtual -= 1;
        }
    }
    
    int paginaAtual(){
        return(this.paginaAtual);
    }
}

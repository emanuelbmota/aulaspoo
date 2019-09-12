public class Bateria{

    double porcentagem;
    double carga;
    double hora;
    double uso;
    

    Bateria(double porcentagem, double carga, double hora){

        this.porcentagem = porcentagem;
        this.carga = carga;
        this.hora = hora;
        
    }

    // metodo para carregar a bateria se for menor que a carga atual
    boolean carregar(double c){

        if ((this.porcentagem+c) <= this.carga){

            this.porcentagem =+ c;
            return(true);

        }
        else{
            return(false);
        }
    }
    // metodo para trocar a bateria se a carga for  = 0
    boolean trocarbat(){

        if(this.porcentagem == 0 || this.uso > this.porcentagem ){

            this.porcentagem = 100;
            return(true);

        }else{
            return(false);
        }

    }

    boolean tempouso(){

        this.hora *= 60;
        this.uso = this.hora/10;

        return(true);

    }

}
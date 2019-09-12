public class TesteBat{

public static void main(String[] args) {

    //parâmetros para a bateria
    Bateria b = new Bateria(61, 100, 10);

    if(b.trocarbat()){

        System.out.println("A bateria estava com 0% de carga, portanto agora está com "+b.porcentagem+"%");

    }
    // um metodo instanciando outro metodo se caso atingir a condição necessária
    else if(b.tempouso()){
        if(b.uso > b.porcentagem){
            b.trocarbat();
            System.out.println("A bateria estava com 0% de carga, portanto agora está com "+b.porcentagem+"%");
        }else{
            System.out.println("Você utilizou "+b.uso+"% de bateria" );
        }
        
        
    }
    


    
}

}
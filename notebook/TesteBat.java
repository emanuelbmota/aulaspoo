public class TesteBat{

public static void main(String[] args) {

    Bateria b = new Bateria(61, 100, 10);

    if(b.trocarbat()){

        System.out.println("A bateria estava com 0% de carga, portanto agora está com "+b.porcentagem+"%");

    }

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
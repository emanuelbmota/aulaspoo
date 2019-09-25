package agencia;

public class TesteAgencia{

    public static void main(String[] args){

        Agencia a1 = new Agencia("4707", 5);
        System.out.println("Sua agência é a "+a1.numero+" e seu banco é o " +a1.banco);
    }
}
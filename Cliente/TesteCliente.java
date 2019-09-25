package Cliente;

public class TesteCliente{

    public static void main(String [] args){

        Cliente c1 = new Cliente("Emanuel", "470.735.668-09");
        System.out.println("Olá prezado "+c1.nomeCliente+" Seu CPF é o "+c1.cpfCliente);
    }

}

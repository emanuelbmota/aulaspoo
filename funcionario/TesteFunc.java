public class TesteFunc {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("José", 15.0, 120.0);
        
        System.out.println("O funcionário: "+ f.nome + " ganha por mês R$ " + f.salario());
    }
}
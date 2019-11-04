package heranca2;

public class TesteFuncionario{

    public static void main(String[] args){

        Funcionario f = new Funcionario();

        Gerente g = new Gerente();

        f.setMatricula(1010);
        f.setNome("José Augusto");
        f.setSalario(1000.00);
        f.calcBonus();
        System.out.println("Salario R$ "+ f.getSalario());

        g.setMatricula(1005);
        g.setNome("Ana Paula");
        g.setSalario(2000.00);
        g.calcBonus();
        System.out.println("Salario R$ "+ g.getSalario());
    }
}
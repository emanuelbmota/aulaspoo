package funcionario2;

public class TesteFunc2 {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Emanuel", 32246455);
        
        f1.registarPonto();
        System.out.println("O funcionario "+f1.nomeFuncionario+" Acabou de bater o ponto, caso queira entrar em contato, o telefone é o " + f1.foneFuncionario);
        System.out.println(f1.Codfuncionario());
        
        Funcionario f2 = new Funcionario("Ezequiel", 32246455);
        
        f2.registarPonto();
        System.out.println("O funcionario "+f2.nomeFuncionario+" Acabou de bater o ponto, caso queira entrar em contato, o telefone é o " + f2.foneFuncionario);
        System.out.println(f2.Codfuncionario());
    }
    
}

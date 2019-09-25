package DeclaraçãoVariáveis;

public class TesteVar {

    public static void main(String[] args) {
        
        Variaveis v1 = new Variaveis("Emanuel", 19, "53.113.008-3", 'M', 1334.84);
        System.out.println("Senhor(a)"+ v1.getName() +", de "+v1.getIdade()+" anos, portador(a) do RG de número "+v1.getRG()+" , do sexo "+ v1.getSexo()+ " está registrado(a) com o salário de R$ "+ v1.getSalario());
    }
    
}

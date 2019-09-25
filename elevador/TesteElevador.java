package elevador;

public class TesteElevador {

    public static void main(String[] args) {
        
        Elevador e1 = new Elevador(50, 25);
        
        if(e1.sobe(5)){
            System.out.println("Você subiu um(uns) andar(andares) portando agora está no andar "+ e1.statusElevador());
        }
        else{
            System.out.println("Não é possível subir um andar");
        }
        
        if(e1.desce(2)){
            System.out.println("Você desceu um(uns) andar(andares), portanto está no andar "+ e1.statusElevador());
        }
        else{
            System.out.println("Não foi possível descer a quantidade de andar");
        }
        
        if (e1.entra(25)){
            System.out.println("Entrou pessoa(s), portanto agora tem "+ e1.statusPessoas()+" no elevador.");
        }
        else{
            System.out.println("Não é possível entrar mais pessoas no elevador, pois atingiu a capacidade máxima.");
        }
        
        if (e1.sai(20)){
            System.out.println("Saiu uma pessoa(s), portanto agora tem " + e1.statusPessoas()+" no elevador.");
        }
        else{
            System.out.println("Não é possível sair pessoas do elevador, pois não tem ninguém ou a quantidade ultrapassa a capacidade.");
        }
    }
    
}

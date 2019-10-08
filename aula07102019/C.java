package aula07102019;

public class C{

    private int a1;
    private int a2;
    private int resultado;

    C(int a1, int a2){

        this.a1 = a1;
        this.a2 = a2;
        this.resultado = resultado;
    }

    private void calc(){
          int resultado = a1*a2;
    }

    public int getResultado(){
        calc();
        return resultado;
    }
}
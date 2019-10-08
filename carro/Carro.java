package carro;

public class Carro {
    
    private float capacidadeTanque;
    private float volumeTanque;
    private float rendimento;
    
    Carro(float capacidadeTanque, float volumeTanque, float rendimento){
        
        this.capacidadeTanque = capacidadeTanque;
        this.volumeTanque = volumeTanque;
        this.rendimento = rendimento;
        
    }
    
    public void encheTanque(float litros){
        
        if (litros <= this.capacidadeTanque && litros <= this.volumeTanque && litros != 0){
            this.volumeTanque += litros;
            System.out.println("Abastecimento realizado.\nVolume no tanque(l): " + this.volumeTanque);
        }
        else{
            System.out.println("Impossível abastecer: " + litros + " litros\nVolume no tanque(l): " + this.volumeTanque + " litros.\nCapadidade do tanque (l): " + this.capacidadeTanque + " litros");
        }
        
    }
    
    public void passeio(float km){
        
        if ((this.volumeTanque * this.rendimento) > km && km != 0){
           this.volumeTanque = (this.rendimento * this.volumeTanque) - km;
            System.out.println("Passeio será realizado com segurança!\n Volume no tanque após passeio (l): " + this.volumeTanque);
        }
        else{
            System.out.println("Não há combustível suficiente para realizar o passeio!\nVolume no tanque (l): "+ this.volumeTanque );
        }
    }
    
}

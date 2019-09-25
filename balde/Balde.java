package balde;

public class Balde {
    
    String material;
    double capacidade;
    double volume;
    
    Balde(String material, double capacidade, double volume){
        
        this.material = material;
        this.capacidade = capacidade;
        this.volume = volume;
        
    }
    
    boolean poe(double v){
        
        if ((this.volume+v) <= this.capacidade){
            
            this.volume+=v;
            return(true);
        
        }else{
            return(false);
      
        }
    }
    
    boolean tira(double v){
        
        if ((this.volume) >= v){
            
            this.volume -= v;
            return(true);
        }
        
        else{
            
            return(false);
        }
        
    }

    
    double mostravol(){
        
        return(this.volume);
        
    }
    

}
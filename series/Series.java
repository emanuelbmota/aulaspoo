
public class Series{

    private int i1;
    private int i2;
    private int passo;

    
    void setI1(int i1){
        this.i1 = i1;

    }

    void setI2(int i2){
        this.i2 = i2;
    }

    void setPasso(int passo){
        if (passo <= 0){
                this.passo = 1;
        }else{
                this.passo = passo;
            }
        }
    

    String mostraSerie(){
        String s="";
        int i =0;

    if(this.i1 < this.i2){
            i = this.i1;
            while(i <= i2){
                s+= i +";";
                i+=this.passo;
                
        }
    
        
    }else{
            i = this.i1;
            while(i >= i2){
                s+= i +";";
                i-=this.passo;
                
        }
    
    }


    
              return (s);
    }
}
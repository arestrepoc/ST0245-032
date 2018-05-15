public class Colision{
    Bee b1;
    Bee b2;
    
    public Colision(Bee b1, Bee b2){
        this.b1 = b1;
        this.b2 = b2;
    }
    public String toString(){
        return " ["+b1+"-"+b2+"] "; 
    }
}

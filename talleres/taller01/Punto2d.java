
/**
 * Taller 1 punto 2
 * Por: Agustin Restrepo y Sebastian Gonzalez
 */
public class Punto2d
{
    private float x;
    private float y;
    public void Punto2d(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float Distancia(Punto2d otroPunto){
        return (float) Math.sqrt(Math.pow(x-otroPunto.getx(), 2)+ Math.pow(y-otroPunto.gety(), 2));
    }
    public float getx(){
        return x;
    }
    public float gety(){
        return y;
    }
    public float radio(){
        return (float) Math.sqrt((x*x)+(y*y));
    }
    public float angulo(){
        return (float) Math.atan2(x,y);
    }
}

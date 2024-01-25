public class Jinro
{
    public double x;
    public Jinro(){
        x=5;
    }
    public Jinro(double x){
        this.x=x;
    }

    public Jinro(double y,String b)
    {
        this.x=y;
        System.out.println(b);
    }

    public double getArea(){
        return Math.PI*x*x;
    }
}

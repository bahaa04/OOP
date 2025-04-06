
public class circle extends shape{
    private double r;
    public circle(String name,double r,double p,double a){
        super(a,p,name);
        this.r=r;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getP() {
        return p;
    }

    @Override
    public double getS() {
        return a;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calcA(){
        return Math.PI*Math.pow(r, 2);
    }

    public double calcP(){
        return 2*r*Math.PI;
    }

    @Override
    public void display(){
        System.out.println("I am a circle,my name is:"+this.name+"with the radius:"+this.r+"and the primitive:"+this.p+" and the area:"+this.a);
    }

}

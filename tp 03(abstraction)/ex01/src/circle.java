
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

    @Override
    public double calcA(){
        this.a=Math.PI * Math.pow(r, 2);
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calcP(){
        this.p=2 * r * Math.PI;
        return 2 * r * Math.PI;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing...");
    }


    @Override
    public void display(){
        System.out.println("I am a circle,my name is:"+this.name+"with the radius:"+this.r+"and the primitive:"+this.p+" and the area:"+this.a);
    }

}

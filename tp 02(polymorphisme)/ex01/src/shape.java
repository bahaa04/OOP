public class shape {
    protected double p;
    protected double a;
    final String name;

    public shape(double P, double S,String name) {
        this.p = P;
        this.a = S;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getP() {
        return 0;
    }

    public void setP(float P) {
        this.p = P;
    }

    public double getS() {
        return 0;
    }

    public void setS(float S) {
        this.a = S;
    }

    public void display(){
        System.out.println("I am a shape my name is"+" with a primitive:"+this.p+"and area:"+this.a);
    }
}

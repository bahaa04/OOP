abstract class shape implements drawable {
    protected double p;
    protected double a;
    final String name;

    public shape(double P, double S,String name) {
        this.p = P;
        this.a = S;
        this.name=name;
    }

    abstract public String getName() ;

    abstract public double getP() ;

    abstract public double getS() ;

    abstract public void display() ;

    abstract public double calcA() ;

    abstract public double calcP() ;
}

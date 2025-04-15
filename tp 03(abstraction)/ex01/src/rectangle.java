public class rectangle extends shape{
    private double l,w;
    public rectangle(double l,double w,double p,double a,String name){
        super(p,a,name);
        this.l=l;
        this.w=w;
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

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public  double calcP(){
        this.p= 2 * (l + w);
        return 2 * (l + w);
    }

    @Override
    public double calcA(){
        this.a= l * w;
        return l * w;
    }

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }

    @Override
    public void display(){
        System.out.println("I am a triangle,my name is:"+this.name+"with a length of:"+l+"and width of:"+w+" and the primitive:"+this.p+" and the area:"+this.a);
    }

}

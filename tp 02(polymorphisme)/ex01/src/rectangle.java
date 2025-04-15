public class rectangle extends shape{
    private double l,w;
    public rectangle(double l,double w,double p,double a,String name){
        super(p,a,name);
        this.l=l;
        this.w=w;
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

    public  double calcA(){
        return 2*l+2*w;
    }

    public double calcP(){
        return l*w;
    }

    public void displayInfo(){
        System.out.println("I am a triangle,my name is:"+this.name+"with a length of:"+l+"and width of:"+w+" and the primitive:"+this.p+" and the area:"+this.a);
    }

}

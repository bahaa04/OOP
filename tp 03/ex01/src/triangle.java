public class triangle extends shape{
    private double h,s1,s2,b;
    public triangle(double h,double s1,double s2,double b,double p,double a,String name){
        super(p,a,name);
        this.h=h;
        this.s1=s1;
        this.s2=s2;
        this.b=b;
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

    public double gets1(){
        return s1;
    }
    
    public void sets1(double s1){
        this.s1=s1;
    }

    public double gets2(){
        return s2;
    }

    public void sets2(double s2){
        this.s2=s2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    @Override
    public void display(){
        System.out.println("I am a triangle,my name is:"+this.name+" with the hight"+this.h+"and faces:"+this.s1+" and "+this.s2+" and with a base: "+this.b+" and the primitive:"+this.p+" and the area:"+this.a);
    }

    public double calcP(){
        return s1+s2+b;
    }
    
    public double calcA(){
        return (b*h)/2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

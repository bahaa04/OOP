public class App {
    public static void main(String[] args) throws Exception {
        int r=0,c=0,t=0;
        shape[] s=new shape[4];
        s[0]=new circle("c1", 15, 0, 0);
        s[1]=new triangle(10, 5, 4, 7, 0, 0, "t1");
        s[2]=new rectangle(10, 7, 0, 0, "r1");
        s[3]=new triangle(13, 8, 6, 10, 0, 0, "t2");
        for (int i = 0; i < 4; i++) {
            if(s[i] instanceof circle){
                c=c+1;
            }else if(s[i] instanceof triangle){
                t=t+1;
            }else{
                r=r+1;
            }
        }
        System.out.println("in your array\nthe number of triangles is :"+t+" \nthe number of circles is "+c+" \nthe number of rectangles is "+r);

    }
}

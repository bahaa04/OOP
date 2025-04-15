import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("select what to do \n1/calculate the area of a triangle+perimeter \n2/calculate the area of a rectangle+perimeter \n3/calculate the area of a circle+perimeter \n4/exit\n");
        Scanner n=new Scanner(System.in);
        int choice=n.nextInt();
        switch(choice){
            case 1:
                System.out.print("enter the base of the triangle: ");
                double base=n.nextDouble();
                System.out.print("enter the height of the triangle: ");
                double height=n.nextDouble();
                System.out.print("enter the first side of the triangle: ");
                double s1=n.nextDouble();
                System.out.print("enter the second side of the triangle: ");
                double s2=n.nextDouble();
                triangle t=new triangle(height,s1,s2,base,0,0,"triangle");
                System.out.println("the area of the triangle is: "+t.calcA() + " and the perimeter is: "+ t.calcP());
                t.draw();
                break;
            case 2:
                System.out.print("enter the length of the rectangle: ");
                double length=n.nextDouble();
                System.out.print("enter the width of the rectangle: ");
                double width=n.nextDouble();
                rectangle r=new rectangle(length,width,0,0,"rectangle");
                System.out.println("the area of the rectangle is: "+r.calcA()+" and the perimeter is: "+r.calcP());
                r.draw();
                break;
            case 3:
                System.out.print("enter the radius of the circle: ");
                double radius=n.nextDouble();
                circle c=new circle("circle",radius,0,0);
                System.out.println("the area of the circle is: "+c.calcA()+" and the perimeter is: "+c.calcA());
                c.draw();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid choice");
        }

    }
}

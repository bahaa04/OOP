public class point {
    int x,y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void  getX(){
        System.out.println(this.x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display(String[] args) {
        System.out.printf("the coordinants are %d and %d",x,y);
    }
}

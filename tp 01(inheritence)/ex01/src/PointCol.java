class PointCol extends point{

    private String color;

    public PointCol(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public PointCol(int x, int y) {
            super(x, y);
        }
    
    @Override
    public void display(String[] args) {
        super.display(args);
        System.out.print("my color is: "+color);
    }


    public String getColor() {
        return color;
    }

    public void Colorise(String color) {
        this.color = color;
    }
    
}
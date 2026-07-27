public class Rectangle extends Shape{
    private double base, height;
    public Rectangle(double base, double height){
        super("Rectangle");
        this.base=base;
        this.height=height;
    }
    public double calArea(){
        return base*height;
    }
}

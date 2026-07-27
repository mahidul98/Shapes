public class Triangle extends Shape {
    double base, height;
    public Triangle(double base, double height){
        super("Triangle");
        this.base=base;
        this.height=height;
    }
    public double calArea(){
        return 0.5*base*height;
    }
}

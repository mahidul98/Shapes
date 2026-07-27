abstract class Shape {
    private String name;

    public Shape(String name){
        this.name=name;
    }
    public abstract double calArea();

    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("Shape: "+ getName()+" Area : "+calArea());
    }
}

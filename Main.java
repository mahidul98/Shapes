public class Main {
    public static void main(String[] args) {
          //Shape s1= new Shape();
          Shape s2= new Rectangle(4,5);
          Shape s3= new Triangle(4,3);

          Shape[] s = {s2, s3};

          for(Shape x : s){
              x.display();
          }
    }
}

package shapes;


public class Square {

    private static int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public static  void getPerimeter(){
        int perimeter = sides * sides;
        System.out.println(" The perimeter of your square is: " + perimeter);
    }
    public static void getArea(){
         int area = sides * 4;
        System.out.println(" The perimeter of your square is: " + area);
    }


    public static void main(String[] args) {

        Square square = new Square(6);
        getArea();
        getPerimeter();


    }


}

package shapes;


    public class Square extends Quadrilateral{
        public Square(int side) {
            super(side,side);
            this.side = side;
        }

        @Override
        public double setWidth() {
            return side;
        }

        @Override
        public double setLength() {
            return side;
        }
    }
    // Beginning of code commented out for interfaces exercise
//    private static int sides;
//
//    public Square(int sides) {
//        this.sides = sides;
//    }
//
//    public static  void getPerimeter(){
//        int perimeter = sides * sides;
//        System.out.println(" The perimeter of your square is: " + perimeter);
//    }
//    public static void getArea(){
//         int area = sides * 4;
//        System.out.println(" The perimeter of your square is: " + area);
//    }
//
//
//    public static void main(String[] args) {
//
//
//        Square square = new Square(6);
//        getArea();
//        getPerimeter();
//






//}

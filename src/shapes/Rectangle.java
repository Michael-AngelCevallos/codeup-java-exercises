package shapes;

public class Rectangle {


    private static int length;
    private static int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static void getArea() {
        int area = length * width;
        System.out.println("This is your area: " + area);
    }
        public static void getPerimeter(){
            int perimeter = (length * 2) +(width * 2);
            System.out.println("This is your perimeter: " + perimeter);
        }




    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8,9);

        getArea();
        System.out.println();
        getPerimeter();

        }

    }




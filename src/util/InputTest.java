package util;

public class InputTest {



        public static void main(String[] args) {
            Input input = new Input();

            System.out.println("What's your name?");

            System.out.println(input.getString());

            System.out.println(input.getInt(1, 100));

            System.out.println(input.getDouble(1, 10000));

            System.out.println(input.yesNo());


        }
    }


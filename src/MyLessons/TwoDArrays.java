package MyLessons;

/** 2D Arrays - array or arrays */

 // think of it as having an array of rows and columns


public class TwoDArrays {

    public static void main(String[] args) {

//        String[][] cars = new String[3][3];// after = sign re-list the data type (String) inside bracket is amount of rows and columns (3 and 3)
        // access row 0 column 0
//        cars[0][0] = "Camaro";
//
//        //access row 0 column 1
//
//        cars [0][1] = "Corvette";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Ferrari";
//        cars [1][1] = "Lambo";
//        cars[1][2] = "Dodge";
//        cars[2][0] = "Tesla";
//        cars [2][1] = "Spider";
//        cars[2][2] = "Mercedes";



        /** ANOTHER WAY TO DO THIS( Same output as above)*/

        String[][] cars = {{"Camaro", "Silverado", "Ferrari" },
                           {"Lambo", "Dodge", "Tesla"},
                           {"Spider", "Mercedes", "Camaro"}};



        for(int i = 0; i < cars.length; i++){
            System.out.println();// moves it to next line in display
            for(int j = 0; j < cars[i].length; j++ ){
                System.out.println(cars[i][j] + "");
            }
        }


    }
}

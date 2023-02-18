package MyLessons;

import java.util.ArrayList; /** 2d Array List - A dynamic list of list.
 * YOU CAN CHANGE THE SIZE OF THESE LIST DURING RUN TIME <----------------------------------
 * */;


public class TwoDArrayList {

    public static void main(String[] args) {

        //Step 1 create seperate shopping list

        /** LIST 1 */
        ArrayList<String> bakeryList = new ArrayList();
        // Add items to ArrayList
        bakeryList.add("Flour");
        bakeryList.add("Salt");
        bakeryList.add("Sugar");

        System.out.println(bakeryList);// RETURNS PASTA

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("Milk");
        produceList.add("Cheese");
        produceList.add("Butter");

        System.out.println(produceList);//Returns Cheese

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("Soda");
        drinksList.add("Coffee");

        System.out.println(drinksList);

        // how to sout an index of a list (get)
        System.out.println(produceList.get(2));// returns butter


        /** Make an Array List to take in ALL prior List */
ArrayList<ArrayList<String>> grocery = new ArrayList<>();

/**ADD ALL LIST TO ONE LIST CALLED GROCERY*/
        grocery.add(bakeryList);
        grocery.add(produceList);
        grocery.add(drinksList);
        System.out.println(grocery);// Returns " [[FLour, Salt, Sugar], [Milk, Cheese, Butter], [Soda, Coffee]] " All on one line


        // How to sout Specific element from new big list ( First get picks list, second get picks element within that list
        System.out.println(grocery.get(0).get(2));// Goes to first List(0) and grabs 3rd element(2) - Returns Sugar from grocery

        System.out.println(grocery.get(2).get(1));// returns Coffee











    }


}

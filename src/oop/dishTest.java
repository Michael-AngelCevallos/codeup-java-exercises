package oop;
//import Dish.java;




    public class dishTest {
        public static void main(String[] args) {


            Dish dish1 = new Dish();
            dish1.costInCents = 50;
            dish1.nameOfDish = "Steak";
            dish1.wouldRecommend = true;

            Dish dish2 = new Dish();
            dish2.costInCents = 30;
            dish2.nameOfDish = "Tacos";
            dish2.wouldRecommend = true;

            Dish dish3 = new Dish();
            dish3.costInCents = 15;
            dish3.nameOfDish = "Chinese Food";
            dish3.wouldRecommend = false;

            dish1.printSummary(dish1.costInCents, dish1.nameOfDish, dish1.wouldRecommend);

            dish2.printSummary(dish2.costInCents, dish2.nameOfDish, dish2.wouldRecommend);

            dish3.printSummary(dish3.costInCents, dish3.nameOfDish, dish3.wouldRecommend);


            System.out.println( DishTools.AVERAGE_COST_OF_DISH_IN_CENTS = new DishTools());
            DishTools shoutDishName = new DishTools();
            DishTools analyzeDishCost = new DishTools();
            DishTools flipRecommendation = new DishTools();



        }
}

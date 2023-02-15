package oop;
//import Dish.java;




    public class dishTest {



            public static void main(String[] args) {

                //instantiate a dish called dish
                Dish dish = new Dish("Cheesy bread sticks" ,1, true);
//                System.out.println(dish.getNameOfDish);
//                dish1.primarySummary();


//            DishTools.shoutDishName(dish1);
//            DishTools.analyze
                System.out.println("Your dish is: " + dish.getNameOfDish()+"\n"  + "Dish cost $ " + dish.getCostInCents() + " " + " \nI would recommend: " + dish.getWouldRecommend());
                //call them eating the dish
                dish.eat();
            }
        }



//        Dish dish1 = new Dish();
//        dish1.costInCents = 50;
//        dish1.nameOfDish = "Steak";
//        dish1.wouldRecommend = true;
//
//        Dish dish2 = new Dish();
//        dish2.costInCents = 30;
//        dish2.nameOfDish = "Tacos";
//        dish2.wouldRecommend = true;
//
//        Dish dish3 = new Dish();
//        dish3.costInCents = 15;
//        dish3.nameOfDish = "Chinese Food";
//        dish3.wouldRecommend = false;
//
//    }



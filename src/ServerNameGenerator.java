

    public class ServerNameGenerator {



        //todo Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        public static String noun () {
            String[] nouns = {"Thomas Jefferson", "Brooklyn Bridge", "Ice Cream", "Tacos", "Jessica Alba", "Washington D.C", "Corn", "Dog", "Pickles", "Los Angeles"};
            //get the random noun from the nouns array
            return getRandom(nouns);
        }

        public static String adjective () {
            String[] adjectives = {"Beautiful", "Ugly", "Delicious", "Tasteful", "Colorful", "Violent", "Deadly", "Quiet", "Shiny", "Small"};
            //get the random noun from the nouns array
            return getRandom(adjectives);
        }



        //todo Create a method that will return a random element from an array of strings.
        public static String getRandom(String[] arraysList) {

            //runs through length of array and grabs random
            int index = (int) (Math.random() * (arraysList.length));
            return arraysList[index];
        }


        //todo Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
            // MAIN METHOD- TEST YOUR METHODS

            public static void main(String[] args) {
                System.out.println("Here is your server name: ");
                System.out.println(noun() + "-" + adjective());


            }

        }






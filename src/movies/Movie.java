package movies;


//todo Download the MoviesArray file and save it as MoviesArray.java inside of movies.movies. This class has a static method named findAll that will return an array of Movie objects.

//todo Create a class named movies.MoviesApplication that has a main method.



//todo Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//todo If a category is selected, only movies.movies from that category should be displayed.
//todo Your application should continue to run until the user chooses to exit.


//todo Create a class named Movie.
public class Movie {




        //todo It should have private fields for name and category
        private String name;
        private String category;


        //todo and a constructor that sets both of these.
        // *constructor <<<<<<----------------
        public Movie(String name, String category) {
            this.name = name;
            this.category = category;
        }


        //todo Create methods to access these properties and change them (getters and setters).

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }


    }








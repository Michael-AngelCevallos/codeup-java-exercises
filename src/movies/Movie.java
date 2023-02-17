package movies;


//todo #5 Download the MoviesArray file and save it as MoviesArray.java inside of movies.movies. This class has a static method named findAll that will return an array of Movie objects.
//todo #6 Create a class named movies.MoviesApplication that has a main method.
//todo #7 Give the user a list of options for viewing all the movies or viewing movies by category.

//todo #8 Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//todo #9 If a category is selected, only movies.movies from that category should be displayed.
//todo #10 Your application should continue to run until the user chooses to exit.


//todo #1 Create a class named Movie.
public class Movie {


    //todo #2 It should have private fields for name and category
    private String name;
    private String category;


    //todo #3 and a constructor that sets both of these.
    // *constructor <<<<<<----------------
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    //todo #4 Create methods to access these properties and change them (getters and setters).


    //getName returns movie name
    public String getName() {
        return name;
    }

    //setName will change the movie name to passed value
    public void setName(String name) {
        this.name = name;
    }


        //getCategory will return the name of Category
        public String getCategory() {
            return category;
        }


        // setCatgeory will change the movie name to a passed value
        public void setCategory(String category) {
            this.category = category;
        }


    }








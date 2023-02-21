package MyLessons;

/** used with Static Keyword Class
 * */



public class Friend {

    String name;
    static int numberOfFriends; // static gives access to numberOfFriends when called upon else where by using Friend.numberOfFriends

    Friend(String name){
        this.name = name;
        numberOfFriends ++; // adds +1 to the numberOfFriends that we have


    }
}

package MyLessons;
/** used with Friend Class*/


/** Static - a single copy of variable/method is created and shared.
 * The class "OWNS" the static member <---------------
 */

/** Static would be useds if you are going to use the same variable with multiple instances*/

public class StaticKeyWord {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Mike");// both friend 1 and friend 2 are sharing the same variable of numberOfFriends(static)
        Friend friend2 = new Friend("Alex");


        System.out.println(Friend.numberOfFriends);
    }


}

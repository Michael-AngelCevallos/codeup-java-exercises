package AbstractLesson;

/** reason to use abstract here example - Say you walk into a dealership and the dealer ask you "what kind of car are you looking for?"
 * Nobody goes in to a dealership and ask to buy "A vehicle" because it too vague. Abstract lets you go deeper into the sub-classes to narrow your search out
 */

public abstract class Vehicle { // declare Vehicle class an abstract one with keyword 'abstract'

    //what is something ALL Vehicles do? Create a method of go and stop
    abstract void go();

    abstract void stop();

    /** However if you declare abstract value here, you must declare a overide method in inherited classes(such as Car)*/
}

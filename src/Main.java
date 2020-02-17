/*
 Course: IST 311
 Semester: Spring 2020
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
 Assignment: IA05
*/

public class Main
{
    public static void showOff(Animal animal) {
        System.out.println(animal.getName() + ":");
        System.out.println("  Speak: '" + animal.speak() + "'");
        System.out.println("  Fly: " + animal.fly());
        System.out.println();
    }

    public static void main(String[] args) {
        //calling Logger constructor by using the getter method
        Logger logger = Logger.getInstance();
        logger.log("Program started");

        //Create a new object by calling buildAnimal() from SimpleAnimalFactory class
        Animal dog = SimpleAnimalFactory.buildAnimal("dog");
        Animal cat = SimpleAnimalFactory.buildAnimal("cat");
        Animal bird = SimpleAnimalFactory.buildAnimal("bird");

        dog.setName("Fido");
        showOff(dog);

        cat.setName("Toonces");
        showOff(cat);

        bird.setName("Tweety");
        showOff(bird);

        //calling Logger constructor by using the getter method
        Logger logger2 = Logger.getInstance();
        logger2.log("Program ended");
    }

}

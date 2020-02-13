/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
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
        Logger logger = new Logger();
        logger.log("Program started");

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.setName("Fido");
        showOff(dog);

        cat.setName("Toonces");
        showOff(cat);

        bird.setName("Tweety");
        showOff(bird);

        Logger logger2 = new Logger();
        logger2.log("Program ended");
    }

}

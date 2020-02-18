/*
 Course: IST 311
 Semester: Spring 2020
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
 Assignment: IA05
*/

import java.util.Scanner;

public class Main
{
    private static final Scanner keyboard = new Scanner(System.in);
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

        System.out.print("Would you like to see all animals or specific animal?");
        System.out.println("PLease choose ");
        System.out.println("1) Animal List");
        System.out.println("2) One Animal");
        System.out.print("Enter choice: ");
        String userInput = keyboard.nextLine();
        int choice = Integer.parseInt(userInput);

        String animalChoice = null;
        switch (choice) {
            case 1:
                /*
                Animal dog = SimpleAnimalFactory.buildAnimal("dog");
                Animal cat = SimpleAnimalFactory.buildAnimal("cat");
                Animal bird = SimpleAnimalFactory.buildAnimal("cat");

                dog.setName("Fido");
                showOff(dog);

                cat.setName("Toonces");
                showOff(cat);

                bird.setName("Tweety");
                showOff(bird);
                break;

                 */
                SimpleAnimalFactory.buildAnimal("dog");
                SimpleAnimalFactory.buildAnimal("cat");
                SimpleAnimalFactory.buildAnimal("bird");
                break;

            case 2:
                System.out.println("PLease choose one animal");
                System.out.println("1) Dog");
                System.out.println("2) Cat");
                System.out.println("2) Bird");
                System.out.print("Enter choice: ");
                String input = keyboard.nextLine();
                int pet = Integer.parseInt(input);

                switch (pet) {
                    case 1:
                        SimpleAnimalFactory.modifyAnimal("1");
                        break;
                    case 2:
                        SimpleAnimalFactory.modifyAnimal("2");
                        break;
                    case 3:
                        SimpleAnimalFactory.modifyAnimal("3");
                        break;
                }



        }


        //Create a new object by calling buildAnimal() from SimpleAnimalFactory class




        //calling Logger constructor by using the getter method
        Logger logger2 = Logger.getInstance();
        logger2.log("Program ended");
    }

}

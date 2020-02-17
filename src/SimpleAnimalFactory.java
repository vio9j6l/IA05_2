/*
 Course: IST 311
 Semester: Spring 2020
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
 Assignment: IA05
*/

//Create new objects based on the animalType variable by if else method
public class SimpleAnimalFactory
{
  public static Animal buildAnimal(String animalType) {
    Animal animalInstance = null;
    if (animalType.equals("dog")) {
      animalInstance = new Dog();
    } else if (animalType.equals("cat")) {
      animalInstance = new Cat();
    } else if (animalType.equals("bird")) {
      animalInstance = new Bird();
    }
    return animalInstance;
  }
}
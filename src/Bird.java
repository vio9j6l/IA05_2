/*
 Course: IST 311
 Semester: Spring 2020
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
 Assignment: IA05
*/

public class Bird extends Animal
{
  @Override
  public String speak() {
    return "Tweet!";
  }

  public Bird() {
    this.setFlight(new CanFly());
  }

}

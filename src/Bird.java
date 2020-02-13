/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
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

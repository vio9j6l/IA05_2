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

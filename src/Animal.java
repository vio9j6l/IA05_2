/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
*/

public abstract class Animal {
  private String name = "";

  public Animal() {
    Logger logger = Logger.getInstance();
    logger.log("Instantiating " + this.getClass().getName());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    Logger logger = Logger.getInstance();
    this.name = name;
    logger.log(String.format("Naming the %s '%s'", this.getClass().getName(), this.name));
  }

  public abstract String speak();

  IFlyable flight = new CannotFly();
  public void setFlight(IFlyable flight) {
    this.flight = flight;
  }

  public String fly() {
    return this.flight.fly();
  }
}

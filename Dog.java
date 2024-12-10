/**
 * Represents a Person with a name and maxLifeSpan
 */
public class Dog {

  private String name;     // first name of dog
  private int maxLifeSpan;         // maxLifeSpan in years
  private int minLifeSpan; //minLifeSpan (12,15,10,8,13,6,14,7,11)

  /** Constructor */
  public Dog(String name, int maxLifeSpan, int minLifeSpan) {
    this.name = name;
    this.maxLifeSpan = maxLifeSpan;
    this.minLifeSpan = minLifeSpan;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for maxLifeSpan */
  public int getMaxLifeSpan() {
    return maxLifeSpan;
  }

  /** Accessor Method for maxLifeSpan */
  public int getMinLifeSpan() {
    return minLifeSpan;
  }
  
  /** toString Method override */
 public String toString() {
    return name + " - " + maxLifeSpan;
    }
  
}
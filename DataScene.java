import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private Dog[] dogs;      // 1D array of Dog objects

  /** Constructor */
  public DataScene() {
    dogs = createDogs();
  }

  /** Returns a 1D array of Dog objects using the txt files in this project */
  public Dog[] createDogs() {
    String[] namesArray = FileReader.toStringArray("name.txt");
    int[] maxLifeSpanArray = FileReader.toIntArray("maxLifeSpan.txt");
    int[] minLifeSpanArray = FileReader.toIntArray("minLifeSpan.txt");
    
    Dog[] dogsArray = new Dog[namesArray.length];
    for (int i = 0; i < dogsArray.length; i++) {
      dogsArray[i] = new Dog(namesArray[i], maxLifeSpanArray[i], minLifeSpanArray[i]);
    }

    return dogsArray;
  }

  /**
   * Top-level method to draw the animation
   * This method colors blue if the dog will not live long
   * and will color pink if it does live long. It also names
   * all of the dogs and their max life spans
   */
  public void drawScene() {
    for (int i = 0; i < dogs.length; i++) {
    Dog d = dogs[i];

    clear("white");
      
   if (d.getMinLifeSpan() < 10) {
    setTextHeight(15);
         clear(Color.BLUE);
drawText("Your dog will not live very long", 20, 200);
    }else if (d.getMinLifeSpan() <= 10){
    setTextHeight(15);
         clear(Color.PINK);
  drawText("Your dog will live a pretty long life", 20, 200);    
    }
      
    drawImage("download-(21).jpeg", 100, 50, 200);

    pause(0.5);

    setTextStyle(Font.MONO, FontStyle.BOLD);
    setTextHeight(20);
    setTextColor("black");
    
    drawText(d.getName(), 80, 250);
    drawText(String.valueOf(d.getMaxLifeSpan()), 80, 300);

      double[] musicSamples = SoundLoader.read("small_dog_bark_IgU_UsS.wav");
      
    pause(0.5);
    }
    }

  /** Other Methods */
  
  }
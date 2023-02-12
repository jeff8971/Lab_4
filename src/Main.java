import sensorcomp.IDiscreteSensor;
import sensorcomp.ISensor;
import sensorcomp.SensorData;
import sensorcomp.WaterSensor;

/**
 * Main of programming. Test of sensor to read SensorData.
 */
public class Main {

  /**
   * Main function.
   *
   * @param args an array of parameters of type String.
   */
  public static void main(String[] args) {
    ISensor sensor = new WaterSensor();
    for (int i = 0; i < 10; i++) {
      System.out.println("Water reading = " + sensor.takeNewReading() + " inches");
      System.out.println("Our basement is flooding (True/False): "
          + ((IDiscreteSensor) sensor).status());
    }
  }
}
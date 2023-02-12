package sensorcomp;

/**
 * Sensor data for smoke test.
 */
public class SensorData {
  private static final double [] readings = {0.1, 0.4, 0.0, 0.51, 0.5, 0.7, 0.0, 2.2, 1.0};
  private static int counter = 0;

  /**
   * Getter of the currentReading.
   *
   * @return the currentReading value.
   */
  public static  double currentReading() {
    int value = counter;
    counter++;
    if (counter >= readings.length) {
      counter = 0;
    }
    return readings[value];
  }

  /**
   * reset the counter to 0.
   */
  public static void reset() {
    counter = 0;
  }
}

package sensorcomp;

/**
 * interface DiscreteSensor.
 */
public interface IDiscreteSensor extends ISensor {
  /**
   * Getter method of status of sensors.
   *
   * @return True or false; sensor status.
   */
  boolean status();

  /**
   * change true to false, vice versa.
   */
  void flipStatus();

  /**
   * Setter of Sensor.
   *
   * @param value set true or false to a sensor.
   */
  void setStatus(boolean value);

  /**
   * Getter default last reading method.
   *
   * @return last reading.
   */
  default double lastReading() {
    return 0;
  }

  /**
   * Default get new reading.
   *
   * @return current reading.
   */
  @Override
  default double takeNewReading() {
    return 0;
  }
}

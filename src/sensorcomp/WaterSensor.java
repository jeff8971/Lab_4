package sensorcomp;

/**
 * WaterSensor class.
 */
public class WaterSensor implements IDiscreteSensor {
  private double currentValue;
  private double lastValue;
  private boolean flooding;

  /**
   * Default constructor of WaterSensor.
   */
  public WaterSensor() {
    this.lastValue = 0;
    this.currentValue = 0;
    this.flooding = false;
  }

  /**
   * Constructor of WaterSensor.
   *
   * @param value the reading was taken to WaterSensor.
   */
  public WaterSensor(double value) {
    this.currentValue = value;
    this.lastValue = 0;
    this.flooding = false;
  }

  /**
   * the status of flooding or not.
   *
   * @return true: flooding; false: no flooding.
   */
  @Override
  public boolean status() {
    return this.flooding;
  }

  /**
   * Switch of the status of flooding, true or false.
   */
  @Override
  public void flipStatus() {
    this.flooding = !this.flooding;
  }

  /**
   * Setter of the WaterSensor.
   *
   * @param value true: flooding; false: no flooding.
   */
  @Override
  public void setStatus(boolean value) {
    this.flooding = value;
  }

  /**
   * the last reading of the waterSensor.
   *
   * @return lastReading value.
   */
  @Override
  public double lastReading() {
    return this.lastValue;
  }

  /**
   * The taker for new reading for waterSensor.
   *
   * @return the currentValue to current new reading.
   */
  @Override
  public double takeNewReading() {
    this.lastValue = this.currentValue;
    this.currentValue = SensorData.currentReading();
    this.setStatus(this.currentValue > 0.5);
    return this.currentValue;
  }
}

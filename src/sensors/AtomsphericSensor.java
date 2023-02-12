package sensors;

public class AtomsphericSensor implements ISensor {

  private double currentValue;
  private double lastValue;

  public AtomsphericSensor(){
    this.currentValue = this.lastValue = 0;
  }

  public AtomsphericSensor(double value) {
    this.currentValue = value;

  }
  @Override
  public double takeNewReading() {
    this.lastValue = this.currentValue;
    this.currentValue = SensorData.currentReading();
    return this.currentValue;
  }

  @Override
  public double lastReading() {
    return this.lastValue;
  }

  protected void initializeWith(double value){
    this.currentValue = lastValue = value;
  }

}

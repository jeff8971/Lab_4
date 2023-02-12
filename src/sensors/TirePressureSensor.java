package sensors;

public class TirePressureSensor extends AtomsphericSensor{
  private static final double HG_TO_PSI = 2.036;


  @Override
  public double takeNewReading() {
    return super.takeNewReading() / HG_TO_PSI;
  }

  @Override
  public double lastReading() {
    return super.lastReading() / HG_TO_PSI;
  }


  public void resetTPM() {
    // super (36)
    this.initializeWith(36 * HG_TO_PSI);
  }
}

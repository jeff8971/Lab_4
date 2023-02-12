package sensors;

public class Main {
  public static void main(String[] agrs) {
    AtomsphericSensor sensor = new AtomsphericSensor();
    // System.out.println(sensor.lastReading()); // zero
    // System.out.println((sensor.takeNewReading()));
    // System.out.println(sensor.lastReading()); // zero
    TirePressureSensor tpm = new TirePressureSensor();
    tpm.resetTPM();
    System.out.println(tpm.lastReading());
    sensor = tpm;
    System.out.println(sensor.takeNewReading());
  }
}

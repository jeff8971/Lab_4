package sensorcomp;

public interface IDiscreteSensor extends ISensor {
  boolean status();
  void flipStatus();
  void setStatus(boolean value);

  default double lastReading() { return 0;}

  @Override
  default double takeNewReading() {return 0;}
}

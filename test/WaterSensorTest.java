import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import sensorcomp.ISensor;
import sensorcomp.SensorData;
import sensorcomp.WaterSensor;

/**
 * Test for class WaterSensor.
 */
public class WaterSensorTest {
  private WaterSensor waterSensor;

  /**
   * Set up waterSensor for testing.
   */
  @Before
  public void setWaterSensor() {
    waterSensor = new WaterSensor();
  }

  /**
   * test for takeNewReading.
   */
  @Test
  public void testTakeNewReading() {
    // double [] readings = {0.1, 0.4, 0.0, 0.51, 0.5, 0.7, 0.0, 2.2, 1.0};
    SensorData.reset();
    double reading1 = waterSensor.takeNewReading(); // 0.1
    assertEquals(0.1, reading1, 0.01);
    double reading2 = waterSensor.takeNewReading(); // 0.4
    assertEquals(0.4, reading2, 0.01);
    double reading3 = waterSensor.takeNewReading(); // 0.0
    assertEquals(0.0, reading3, 0.01);
  }

  /**
   * Test the lastReading of the waterSensor.
   */
  @Test
  public void testLastReading() {
    SensorData.reset();
    waterSensor.takeNewReading();
    waterSensor.takeNewReading();
    double lastReading = waterSensor.lastReading();
    assertEquals(0.1, lastReading, 0.01);
  }

  /**
   * Test the setter of status of the waterSensor.
   */
  @Test
  public void testSetStatus() {
    waterSensor.setStatus(true);
    boolean status = waterSensor.status();
    assertTrue(status);

    waterSensor.setStatus(false);
    boolean status2 = waterSensor.status();
    assertFalse(status2);

  }

  /**
   * Test method for checking to make sure that the get status method works as expected.
   */
  @Test
  public void testGetStatus() {
    // assert that the status method returns false
    assertFalse(waterSensor.status());
    // change the status of the water sensor
    waterSensor.flipStatus();
    // assert that the get status now returns the updated value
    assertTrue(waterSensor.status());
  }

  /**
   * Test method for checking the flip status.
   */
  @Test
  public void testFlipStatus() {

    // assert that the status method returns false
    assertFalse(waterSensor.status());
    // change the status of the water sensor
    waterSensor.flipStatus();
    // assert that the get status now returns the updated value
    assertTrue(waterSensor.status());
    // flip the status back to the original value
    waterSensor.flipStatus();
    // check to make sure that the status changed again
    assertFalse(waterSensor.status());

  }

}

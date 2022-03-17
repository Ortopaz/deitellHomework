package basiAc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class bassiAcConfigurationTest<number> {

    @Test
    public void bassiAcTemp() {
        Oron deitel = new Oron();
        assertNotNull(deitel);
    }

    @Test
    public void toCheckIfSwitchIsOn() {
        Oron deitel = new Oron();
        deitel.setSwitch();
        assertEquals(true, deitel.isOn());
    }

    @Test
    public void toCheckIfAcCanSwitchOff() {
        Oron deitel = new Oron();
        deitel.setSwitch();
        deitel.isOn();
        deitel.isOff();
        assertEquals(false, deitel.toCheckIfAcCanSwitchOff);
    }

    @Test
    public void toIncreaseTheTemperature() {
        Oron deitel = new Oron();
        deitel.setSwitch();
        deitel.increaseTemperature();
        assertEquals(1, deitel.getTemperature());
    }

    @Test
    public void todecreaseTheTemperature() {
        Oron deitel = new Oron();
        deitel.setSwitch();
        deitel.increaseTemperature();
        deitel.decreaseTemperature();
        assertEquals(0, deitel.getTemperature);
    }

    @Test
    public void temperatureWillNotIncreaseBeyond30() {
        Oron deitel = new Oron();
        deitel.setSwitch();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        deitel.increaseTemperature();
        assertEquals(30, deitel.getTemperature());
    }

    @Test
          a!  public void actualNumbers()
    int number = 2, 4, 6, 8, 10;
    while (number =2, 4,6 8) {
        int evenNumber;
        number = evenNumber;
        System.out.print)(number+ " ")
    }
}
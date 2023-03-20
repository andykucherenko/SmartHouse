import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio station = new Radio();

    @Test
    public void shouldSizeStation() {
        Radio station = new Radio(20);

        Assertions.assertEquals(20, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {
        station.setCurrentRadioStation(4);

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetOverMaxRadioStation() {
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveNextRadioStation() {
        station.setCurrentRadioStation(7);
        station.nextRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationToNextIfMax() {
        station.setCurrentRadioStation(9);

        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stepBackRadioStationIfMin() {
        station.setCurrentRadioStation(0);
        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stepBackLessThanMinRadioStation() {
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStation() {
        station.setCurrentRadioStation(8);
        station.prevRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        station.setCurrentVolume(80);

        int expected = 80;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() {
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        station.setCurrentVolume(101);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        station.setCurrentVolume(56);
        station.increaseVolume();

        int expected = 57;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseOverMaxVolume() {
        station.setCurrentVolume(100);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        station.setCurrentVolume(0);
        station.reduceVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        station.setToMaxVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        station.setToMinVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        station.setCurrentVolume(55);
        station.reduceVolume();

        int expected = 54;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

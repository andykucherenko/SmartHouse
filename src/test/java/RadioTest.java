import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetSelectedRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(4);
        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.nextRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.prevRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnByOneStepRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = station.getCurrentRadioStation();
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnBeforeMaxRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.prevRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(6);

        int expected = 6;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinSoundVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxSoundVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(120);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        Radio station = new Radio();
        station.setCurrentVolume(40);
        station.increaseVolume();

        int expected = 41;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeMoreThenAllowed() {
        Radio station = new Radio();
        station.setCurrentVolume(120);
        station.increaseVolume();

        int expected = station.getCurrentVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOverVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.increaseVolume();

        int expected = station.getCurrentVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceSoundVolumeByOne() {
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.reduceVolume();

        int expected = 99;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinSoundVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.reduceVolume();

        int expected = station.getCurrentVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

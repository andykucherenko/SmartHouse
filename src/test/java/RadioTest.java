import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {
    Radio station = new Radio();

    @Test
    public void quantityStation() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(15);
        int expected = 15;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        station.setCurrentRadioStation(4);
        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        station.setCurrentRadioStation(10);
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOver0RadioStation() {
        station.setCurrentRadioStation(5);
        station.nextRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxRadioStation() {
        station.setCurrentRadioStation(9);
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moveNextRadioStation() {
        station.setCurrentRadioStation(9);
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stepBackRadioStation() {
        station.setCurrentRadioStation(0);
        station.prevRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stepBackLessThanMinRadioStation() {
        station.setCurrentRadioStation(-1);
        int expected = station.getCurrentRadioStation();
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stepBackLess9RadioStation() {
        station.setCurrentRadioStation(8);
        station.prevRadioStation();
        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        station.setCurrentVolume(6);
        int expected = 6;
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
        station.setCurrentVolume(3);
        station.increaseVolume();
        int expected = 4;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOverVolume() {
        station.setCurrentVolume(100);
        station.increaseVolume();
        int expected = station.getCurrentVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        station.setCurrentVolume(3);
        station.reduceVolume();
        int expected = 2;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        station.setCurrentVolume(0);
        station.reduceVolume();
        int expected = station.getCurrentVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

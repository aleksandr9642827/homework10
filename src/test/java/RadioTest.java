import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setDefaultValidRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(1);

        int expectedRadioStation = 1;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void setValidRadioStation() {
        Radio radio = new Radio(15);
        radio.setRadioStation(13);

        int expectedRadioStation = 13;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void setDefaultInvalidRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(10);

        int expectedRadioStation = 0;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void setInvalidRadioStation() {
        Radio radio = new Radio(15);
        radio.setRadioStation(16);

        int expectedRadioStation = 0;
        int actualRadioStation = radio.getCurrentRadioStation();

        String expectedError = "Неправильный номер радио станции, переключаю на станцию по умолчанию - 0";

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void setNegativeRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);

        int expectedRadioStation = 0;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.nextRadioStation();

        int expectedRadioStation = 6;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void nextMaxRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();

        int expectedRadioStation = 0;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prevRadioStation();

        int expectedRadioStation = 4;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void prevMinRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();

        int expectedRadioStation = 9;
        int actualRadioStation = radio.getCurrentRadioStation();

        Assertions.assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expectedVolume = 11;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.increaseVolume();

        int expectedVolume = 100;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    void reduceVolume() {
        Radio radio = new Radio();
        radio.reduceVolume();

        int expectedVolume = 9;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    void reduceMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        radio.reduceVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }
}

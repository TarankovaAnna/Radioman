package ru.netology.radio;

import com.beust.ah.A;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.radio.Radio;

public class RadioTest {

    // переключение на предыдущую станцию, при новых значениях количества станций и текущей радиостанции
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations.csv")
    public void testShouldSetPrevStation(int expected, int amountOfStation, int numberOfCurrentStation) {

        Radio radio = new Radio(amountOfStation);
        radio.setNumberOfCurrentStation(numberOfCurrentStation);


        radio.prevStation();


        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //переключение на следующую станцию, при новых значениях количества станций и текущей радиостанции
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void testShouldSetNextStation(int expected, int amountOfStation, int numberOfCurrentStation) {

        Radio radio = new Radio(amountOfStation);
        radio.setNumberOfCurrentStation(numberOfCurrentStation);


        radio.nextStation();


        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //переключение на следующую станцию, при новом значении текущей радиостанции и количества станций, заданных по умолчанию
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextByDefault.csv")
    public void testShouldSetNextStationThanAmountOfStationByDefault(int expected, int numberOfCurrentStation) {

        Radio radio = new Radio();
        radio.setNumberOfCurrentStation(numberOfCurrentStation);


        radio.nextStation();


        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //переключение на предыдущую станцию, при новом значении текущей радиостанции и количества станций, заданных по умолчанию
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevByDefault.csv")
    public void testShouldSetPrevStationThanAmountOfStationByDefault(int expected, int numberOfCurrentStation) {

        Radio radio = new Radio();
        radio.setNumberOfCurrentStation(numberOfCurrentStation);


        radio.prevStation();

        //int expected = 2;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


//увеличение громкости


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheLowestValue(int expected, int getCurrentVolume) {
        Radio radio = new Radio();

        radio.setCurrentVolume(getCurrentVolume);

        radio.increaseVolume();


        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


//уменьшение громкости

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheLowerValue(int expected, int getCurrentVolume) {
        Radio radio = new Radio();

        radio.setCurrentVolume(getCurrentVolume);

        radio.decreaseVolume();


        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

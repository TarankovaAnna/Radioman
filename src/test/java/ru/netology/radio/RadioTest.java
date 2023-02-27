package ru.netology.radio;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.radio.Radio;

public class RadioTest {
    //переключение на следующую станцию


    @Test
    public void shouldSetNextStationIfCurrentIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(0);

        radio.nextStation();


        int expected = 1;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsInTheMiddle() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsTheHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsHighestThanHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(10);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(-1);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


//переключение на предыдущую станцию


    @Test
    public void shouldSetPrevStationIfCurrentIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStationIfCurrentIsOnTheLowerBorder() {
        Radio radio = new Radio();

       radio.setNumberOfCurrentStation(1);

       radio.prevStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationIfCurrentIsInTheMiddle() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsTheHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsHighestThanHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(10);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(-1);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


//выставление номера радиостанции через прямое указание ее номера


    @Test
    public void shouldSetNewStationOfTheLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(0);

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStationOfTheLowerBoundaryValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(1);

        int expected = 1;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStationOfTheMiddleValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        int expected = 5;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStationOfTheUpperBoundaryValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(9);

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStationIfValueIsMoreThanUpperBound() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(10);

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStationIfValueIsLessThanTheLowerBound() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


//увеличение громкости


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeInTheMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheHighBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeMoreThanHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


//уменьшение громкости

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheLowerValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeInTheMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheHighBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsLowestThanLowerValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeMoreThanHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

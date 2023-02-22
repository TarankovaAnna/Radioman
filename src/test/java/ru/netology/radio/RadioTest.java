package ru.netology.radio;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.radio.Radio;

public class RadioTest {
    //тестирование кнопки next


    @Test
    public void shouldSetNextStationIfCurrentIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(0);

        int expected = 1;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(1);

        int expected = 2;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsInTheMiddle() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        int expected = 6;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(8);

        int expected = 9;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfCurrentIsTheHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(9);

        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsHighestThanHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(10);

        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationIfCurrentIsLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(-1);

        int expected = 1;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);

    }


//тестирование кнопки prev


    @Test
    public void shouldSetPrevStationIfCurrentIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(0);

        int expected = 9;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(1);

        int expected = 0;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationIfCurrentIsInTheMiddle() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        int expected = 4;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(8);

        int expected = 7;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsTheHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(9);

        int expected = 8;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsHighestThanHighValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(10);

        int expected = 8;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfCurrentIsLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(-1);

        int expected = 9;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);

    }


//тестирование выставления номера радиостанции через прямое указание ее номера


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


//тестирование увеличения громкости


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheLowestValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 2;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeInTheMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 6;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeIsTheHighBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeLessThanLowestValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentVolumeMoreThanHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }


//тестирование уменьшения громкости

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheLowerValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeInTheMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 4;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 8;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsTheHighBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeIsLowestThanLowerValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentVolumeMoreThanHighValue() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}

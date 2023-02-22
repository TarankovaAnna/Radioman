package ru.netology.radio;

public class Radio {
    public int numberOfCurrentStation;
    public int currentVolume;


    public int nextStation() {
        if (numberOfCurrentStation <= 8) {
            numberOfCurrentStation = numberOfCurrentStation + 1;
        } else {
            numberOfCurrentStation = 0;
        }
        return numberOfCurrentStation;
    }

    public int prevStation() {
        if (numberOfCurrentStation > 0) {
            numberOfCurrentStation = numberOfCurrentStation - 1;
        } else {
            numberOfCurrentStation = 9;
        }
        return numberOfCurrentStation;
    }

    public void setNumberOfCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        numberOfCurrentStation = newCurrentStation;
    }

    public int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

}


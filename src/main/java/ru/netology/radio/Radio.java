package ru.netology.radio;

public class Radio {
    private int numberOfCurrentStation;
    private int currentVolume;


    protected int nextStation() {
        if (numberOfCurrentStation <= 8) {
            numberOfCurrentStation = numberOfCurrentStation + 1;
        } else {
            numberOfCurrentStation = 0;
        }
        return numberOfCurrentStation;
    }



    protected int prevStation() {
        if (numberOfCurrentStation > 0) {
            numberOfCurrentStation = numberOfCurrentStation - 1;
        } else {
            numberOfCurrentStation = 9;
        }
        return numberOfCurrentStation;
    }



    protected void setNumberOfCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        numberOfCurrentStation = newCurrentStation;
    }

    protected int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }

    protected int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

        return currentVolume;
    }


    protected int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }



    protected void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    protected int getCurrentVolume() {
       return currentVolume;
    }

}


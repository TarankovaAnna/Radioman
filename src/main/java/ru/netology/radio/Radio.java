package ru.netology.radio;

public class Radio {
    private int numberOfCurrentStation;
    private int currentVolume;
    private int amountOfStation = 10;
    private int minStation = 0;
    private int maxStation = 9;

    protected Radio() {
        this.amountOfStation = amountOfStation;
    }

    protected Radio(int amountOfStation) {
        if (amountOfStation < 0) {
            amountOfStation = 0;

        }
        if (amountOfStation == 0) {              //в условиях не указано минимальное количество станций, я предположила,
            amountOfStation = 1;                 //что если установлено количество станций равное нулю, то по умолчанию
        } else {                                 //выставится одна станция.
            this.amountOfStation = amountOfStation;
        }
        this.amountOfStation = amountOfStation;
    }

    protected int getMaxStation() {
        maxStation = amountOfStation - 1;
        return maxStation;
    }


    protected void setNumberOfCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 0) {
            numberOfCurrentStation = 0;

        }
        if (newCurrentStation >= getMaxStation()) {
            numberOfCurrentStation = getMaxStation();
        }
        if (newCurrentStation > 0 && newCurrentStation < getMaxStation()) {
            numberOfCurrentStation = newCurrentStation;
        }


    }


    protected int getAmountOfStation() {
        return amountOfStation;
    }


    protected int nextStation() {
        if (numberOfCurrentStation <= getMaxStation() - 1) {
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
            numberOfCurrentStation = maxStation;
        }
        return numberOfCurrentStation;
    }

    protected int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }


//Громкость


    protected int increaseVolume() {
        if (currentVolume < 100) {
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
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    protected int getCurrentVolume() {
        return currentVolume;
    }

}


package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int setCurrentStation(int currentStation) {

        if (currentStation > 9) {
            currentStation = 0;
        }

        if (currentStation < 0) {
            currentStation = 0;
        }

        if (currentStation > 0) {
            this.currentStation = currentStation;
        }

        this.currentStation = currentStation;

        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }
}

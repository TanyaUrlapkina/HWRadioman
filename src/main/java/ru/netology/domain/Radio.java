package ru.netology.domain;

public class Radio {
    private int numberStations = 9;
    private int currentStation = 8;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 35;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }

    public Radio() {
    }

    public int setCurrentStation(int currentStation) {

        if (currentStation > (numberStations - 1)) {
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

        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = currentVolume;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
    }

    public void increaseStation() {


        if (currentStation < (numberStations - 1)) {
            currentStation = currentStation + 1;
        }
        if (currentStation == (numberStations - 1)) {
            currentStation = 0;
            return;
        }


        this.currentStation = currentStation;

    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = numberStations - 1;
        }
    }
}

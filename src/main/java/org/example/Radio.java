package org.example;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation != minStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {

        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

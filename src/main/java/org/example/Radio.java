package org.example;

public class Radio {

    private int maxStation =9;
    private int minStation = 0;
    private int currentRadioStation = minStation;

    public Radio(int size) {
        maxStation = minStation + size;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation > minStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    private int currentVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {

        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

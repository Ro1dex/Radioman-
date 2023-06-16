package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        } else if (station < 0) {
            currentStation = 0;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else currentStation--;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            currentVolume = volume;
        } else if (volume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = 10;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }

    }
}

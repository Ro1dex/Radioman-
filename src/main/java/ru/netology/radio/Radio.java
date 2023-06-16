package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int sumStation = 10;
    private int maxStation = sumStation - 1;

    public Radio(int sumStation) {
        this.sumStation = sumStation;
        this.maxStation = sumStation - 1;
    }
    public Radio(){
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStation) {
            currentStation = station;
        } else if (station < 0) {
            currentStation = 0;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else currentStation--;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        } else if (volume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = 100;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }

    }
}

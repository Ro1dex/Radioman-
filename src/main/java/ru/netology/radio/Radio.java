package ru.netology.radio;

public class Radio {
    public int currentVolume;
    public int currentStation;

    public int getCurrentVolume(int volume) {
        currentVolume = volume;
        return volume;
    }

    public int setCurrentStation(int station) {
        if (currentStation > 9) return 9;
        if (currentStation < 0) return 0;
        currentStation = station;
        return station;
    }

    public void getCurrentStation(int newStation) {
        currentStation = newStation;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else currentStation++;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else currentStation--;
    }

    public void setCurrentVolume(int volume) {
        currentVolume = volume;

    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        } else currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }
}

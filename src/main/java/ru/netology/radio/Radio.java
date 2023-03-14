package ru.netology.radio;

public class Radio {
    protected int rangeStationNum;
    protected int currentStationNum;
    protected int currentVolume;

    public Radio (int rangeStationNum) {
        this.rangeStationNum = rangeStationNum;
    }
    public Radio () {
        this.rangeStationNum = 10;
    }
    public int getCurrentStationNum() {
        return currentStationNum;
    }
    public void setCurrentStationNum(int newCurrentStationNum) {
        if (newCurrentStationNum < 0) {
            return;
        }
        if (newCurrentStationNum >= rangeStationNum) {
            return;
        }
        currentStationNum = newCurrentStationNum;
    }
    public void next() {
        currentStationNum = (currentStationNum == rangeStationNum - 1) ? 0 : currentStationNum + 1;
    }
    public void prev() {
        currentStationNum = (currentStationNum == 0) ? rangeStationNum -1 : currentStationNum - 1;
    }

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
        this.currentVolume = newCurrentVolume;
    }
    public void upVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }
    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
    public void maxVolume() {
        currentVolume = 100;
    }
    public void minVolume() {
        currentVolume = 0;
    }
}

package ru.netology.javaqa.radio;

public class Radio {
    private int currentVolume;
    private int currentStationNumber;
    private int stationCounter;

    public Radio() {
        this.stationCounter = 10;

    }

    public Radio( int stationCounter ) {
        this.stationCounter = stationCounter;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber >= stationCounter) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < stationCounter-1) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = stationCounter-1;
        }
    }

}


package radioman;


public class Radio {
    private int currentRadioStation = 10;
    private int maxCurrentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxCurrentRadioStation = currentRadioStation;
    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxCurrentRadioStation = currentRadioStation;
    }

    public void setCurrentRadioStation(int station) {
        if (station < 0) {
            return;
        } else if (maxCurrentRadioStation <= station) {
            return;
        } else {
            this.currentRadioStation = station;
        }
    }

    public int getCurrentRadioStation() {
        if (currentRadioStation < 0) {
            return 0;
        } else if (currentRadioStation >= maxCurrentRadioStation) {
            return 0;
        } else {
            return currentRadioStation;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxCurrentRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxCurrentRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void setCurrentVolume(int inVolume) {
        if (inVolume < minVolume) {
            return;
        } else if (inVolume > maxVolume) {
            return;
        } else {
            currentVolume = inVolume;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int radioStationCount;

    Radio(int count) {
        currentStation = 0;
        currentVolume = 10;
        radioStationCount = count;
    }
    Radio() {
        currentStation = 0;
        currentVolume = 10;
        radioStationCount = 10;
    }

    public void setMaxVolume() {
        while (this.currentVolume != 100) {
            increaseVolume();
        }
    }

    public void setMinVolume() {
        while (this.currentVolume != 0) {
            reduceVolume();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }

    public void setRadioStation(int currentStation) {
        int firstStation = 0;
        int lastStation = this.radioStationCount - 1;
        if (currentStation >= firstStation && currentStation <= lastStation) {
            this.currentStation = currentStation;
        } else {
            this.currentStation = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void nextRadioStation() {
        if (currentStation != 9) {
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentStation != 0) {
            currentStation --;
        } else {
            currentStation = 9;
        }
    }
}

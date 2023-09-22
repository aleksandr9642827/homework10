public class Radio {
    private int currentStation;
    private int currentVolume;
    private int radioStationCount;
    private String error;

    Radio(int count) {
        currentStation = 0;
        currentVolume = 10;
        error = null;
        radioStationCount = count;
    }
    Radio() {
        currentStation = 0;
        currentVolume = 10;
        error = null;
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
            this.error = null;
        } else {
            this.error = "Неправильный номер радио станции, переключаю на станцию по умолчанию - 0";
            this.currentStation = 0;
        }
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public String getError() {
        return error;
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

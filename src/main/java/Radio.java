public class Radio {

    private int currentChanel;
    private int currentVolume;


    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > 9) {
            return;
        }
        if (currentChanel < 0) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void nextChanel(int nextChanel) {

        if (nextChanel < 10) {
            currentChanel = nextChanel + 1;
        }
    }

    public void prevChanel(int prevChanel) {

        if (prevChanel > 0) {
            currentChanel = prevChanel - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume >= 10) {


            return ;

        }
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int increaseVolume) {

        if (increaseVolume < 10) {
            currentVolume = increaseVolume + 1;
        }
    }

    public void decreaseVolume(int decreaseVolume) {

        if (decreaseVolume > 0) {
            currentVolume = decreaseVolume - 1;
        }
    }
}










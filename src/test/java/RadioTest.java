import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void currentChanel() {

        Radio rad = new Radio();

        rad.setCurrentChanel(9);

        int actual = rad.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentChanel1() {

        Radio rad = new Radio();

        rad.setCurrentChanel(11);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentChanel2() {

        Radio rad = new Radio();

        rad.setCurrentChanel(-1);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextChane() {

        Radio rad = new Radio();

        rad.nextChanel(5);
        int actual = rad.getCurrentChanel();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void nextChane1() {

        Radio rad = new Radio();

        rad.nextChanel(10);
        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prevChane() {

        Radio rad = new Radio();

        rad.prevChanel(8);
        int actual = rad.getCurrentChanel();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void prevChane1() {

        Radio rad = new Radio();

        rad.prevChanel(0);
        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentVolume() {

        Radio rad = new Radio();

        rad.setCurrentVolume(8);

        int actual = rad.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentVolume1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

@Test
    public void currentVolume2() {

        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void increaseVolume() {

        Radio rad = new Radio();

        rad.increaseVolume(6);
        int actual = rad.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void increaseVolume1() {

        Radio rad = new Radio();

        rad.increaseVolume(10);
        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void decreaseVolume() {

        Radio rad = new Radio();

        rad.decreaseVolume(6);
        int actual = rad.getCurrentVolume();
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void decreaseVolume1() {

        Radio rad = new Radio();

        rad.decreaseVolume(0);
        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}


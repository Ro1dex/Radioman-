import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;
public class RadioTest {
    @Test
    public void shouldSetStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int exp = 0;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldNotSetStationAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int exp = 9;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldNotSetStationAboveMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int exp = 0;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int exp = 2;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldNextStationMaxOver(){
        Radio radio= new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int exp = 0;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldPrevStationMinOver(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int exp = 9;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        int exp = 1;
        int act = radio.getCurrentStation();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();
        int exp = 0;
        int act = radio.getVolume();
        Assertions.assertEquals(exp,act);
    }

        @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int exp = 2;
        int act = radio.getVolume();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldNotIncreaseVolumeOverMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int exp = 10;
        int act = radio.getVolume();
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int exp = 4;
        int act = radio.getVolume();
        Assertions.assertEquals(exp,act);
    }
    @Test
    void shouldNotDecreaseVolumeOverMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int exp = 0;
        int act = radio.getVolume();
        Assertions.assertEquals(exp,act);
    }
}

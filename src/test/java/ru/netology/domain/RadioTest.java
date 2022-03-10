package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSwitchRadioStationOn16() {
        Radio radio = new Radio(100);


        radio.setCurrentStation(16);


        int expected = 16;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOn60() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(60);

        int expected = 60;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOn1() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(1);


        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOn0() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationOn100() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(100);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxRadioStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);

        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStation6to5() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(6);

        radio.decreaseStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStation0to1() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);

        radio.increaseStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinRadioStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);

        radio.decreaseStation();

        int expected = 99;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStation98to99() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(98);

        radio.increaseStation();

        int expected = 99;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStation30to31() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(30);

        radio.increaseStation();

        int expected = 59;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationMore99() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);

        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationInvalidValueMax() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(117);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioNormStationOn3() {
        Radio radioNorm = new Radio();

        radioNorm.setCurrentStation(3);

        int expected = 3;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioNormStationOn0() {
        Radio radioNorm = new Radio();

        radioNorm.setCurrentStation(0);

        int expected = 0;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioNormStationOn10() {
        Radio radioNorm = new Radio();

        radioNorm.setCurrentStation(10);

        int expected = 0;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxRadioNormStation() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(9);

        radioNorm.increaseStation();

        int expected = 0;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioNormStation9to8() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(9);

        radioNorm.decreaseStation();

        int expected = 8;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinRadioNormStation() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(0);

        radioNorm.decreaseStation();

        int expected = 9;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioNormStation8to9() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(8);

        radioNorm.increaseStation();

        int expected = 9;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioNormStation9to10() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(9);

        radioNorm.increaseStation();

        int expected = 0;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioNormStationInvalidValueMax() {
        Radio radioNorm = new Radio();
        radioNorm.setCurrentStation(100);

        int expected = 0;
        int actual = radioNorm.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume120() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        int expected = 35;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume99to100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume100to101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume0to1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume100to99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1to0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLess0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    private void assertEquals(int expected, int actual) {
    }

}
package week5;

public class Streets {
    String streetName;
    int streetLength;
    int streetWidth;
    boolean streetMain;
    House[] house;
    Parks[] parks;

    public Streets(String streetName, int streetLength, int streetWidth, boolean streetMain, House[] house, Parks[] parks) {
        this.streetName = streetName;
        this.streetLength = streetLength;
        this.streetWidth = streetWidth;
        this.streetMain = streetMain;
        this.house = house;
        this.parks = parks;
    }
}


package week5;

public class Cities {
    String citiesName;
    int cityLength;
    int cityWidth;
    Streets[] streets;

    public Cities (String citiesName, int cityLength, int cityWidth, Streets[] streets) {
        this.citiesName = citiesName;
        this.cityLength = cityLength;
        this.cityWidth = cityWidth;
        this.streets = streets;
    }
}

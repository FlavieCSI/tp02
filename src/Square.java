package Form;

public class Square extends Rectangle implements forme2d {
    private double lon = 0.0D;

    public Sqaure(double lon) {
        super(lon, lon);
        this.lon = lon;
    }

    public double aire() {
        return this.lon * this.lon;
    }

    public double perimetre() {
        return this.lon * 4.0D;
    }

    public double getLon() {
        return this.lon;
    }

    public boolean verif() {
        return this.lon > 0.0D;
    }
}

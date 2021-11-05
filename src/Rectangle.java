

public class Rectangle implements Form2d {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double aire() {
        return this.longueur * this.largeur;
    }

    public double perimetre() {
        return this.longueur * 2.0D + this.largeur * 2.0D;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLongueur(double lon) {
        this.longueur = lon;
    }

    public void setLargeur(double lar) {
        this.largeur = lar;
    }

    public boolean verif() {
        return this.longueur > 0.0D && this.largeur > 0.0D;
    }
}


    public class Diamond extends Square implements Form2d {

        private double cote;
        private double diagonal;

        public Diamond(double lon) {
        super(lon);
        this.cote = lon;
        }

    public double aire(double d1, double coteR) {

            double d2 = Math.sqrt(4.0D * coteR * coteR - d1 * d1);
            double aire = 0.5D * d1 * d2;
            this.diagonal = d2;
            return aire;
    }

    public double perimetre() {
        return this.cote * 4.0D;
    }

    public double getCote() {
        return this.cote;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

    public boolean verif() {
        return this.cote > 0.0D;
    }
}

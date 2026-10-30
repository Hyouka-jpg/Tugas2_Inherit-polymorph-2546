package soal2;

/**
 * Superclass Lingkaran untuk pengujian polimorfisme geometri.
 */
public class Lingkaran {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double luas() {
        return Math.PI * r * r;
    }
}
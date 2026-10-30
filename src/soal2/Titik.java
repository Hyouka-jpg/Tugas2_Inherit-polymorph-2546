package soal2;

/**
 * Subclass Titik yang meng-override luas() dari Lingkaran (Relasi Is-A yang kurang tepat secara desain).
 */
public class Titik extends Lingkaran {

    public Titik() {
        super(0);
    }

    @Override
    public double luas() {
        return 0.0;
    }
}
package soal2;

/**
 * Subclass B yang meng-override init() milik A.
 */
public class B extends A {
    private int nilai = 5;

    public B() {
        System.out.println("B dibuat, nilai=" + nilai);
    }

    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
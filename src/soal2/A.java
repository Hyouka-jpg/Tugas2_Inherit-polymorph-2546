package soal2;

/**
 * Superclass untuk demo constructor chaining dan override method saat instansiasi.
 */
public class A {

    public A() {
        System.out.println("A dibuat");
        init();
    }

    public void init() {
        System.out.println("init A");
    }
}
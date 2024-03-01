public class Main {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("AAAAAAAAAAAAA");
        t1.start();
        ThreadTest t2 = new ThreadTest("BBBBBBBBBBBBB");
        t2.start();

    }
}
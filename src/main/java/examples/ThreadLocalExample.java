package examples;

public class ThreadLocalExample extends Thread{

    private static final ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);

    private final int step;

    public ThreadLocalExample(int step) {
        this.step = step;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (counter.get() < 100){
            counter.set(counter.get() + step);
            System.out.println(name + ": counter = " + counter.get());
        }
    }

    public static void main(String[] args) {
        ThreadLocalExample thread1 = new ThreadLocalExample(2);
        ThreadLocalExample thread2 = new ThreadLocalExample(3);
        thread1.start();
        thread2.start();
    }

}

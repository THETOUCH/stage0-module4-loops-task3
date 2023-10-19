package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 1;
        int b = 1;
        if (lastFibonacci>=1) System.out.println(0);
        if (lastFibonacci>=2) System.out.println(1);
        if (lastFibonacci>=3) System.out.println(1);
        for (int i=4;i<=lastFibonacci;i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}

package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int a = firstBoarder;
        int b = secondBoarder;
        int sum = 0;
        while (a<=b) {
            sum = sum + a;
            a++;
        }
        System.out.println(sum);
    }
}

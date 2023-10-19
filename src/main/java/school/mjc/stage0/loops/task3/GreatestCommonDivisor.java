package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int i;
        int result = 0;
        for (i=1; i<=second;i++) {
            if (first%i==0 && second%i==0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}

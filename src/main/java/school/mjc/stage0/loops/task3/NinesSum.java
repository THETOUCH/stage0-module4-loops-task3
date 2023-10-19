package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int i;
        int a=9;
        int sum = 0;
        for (i=1;i<=lengthOfLastNumber;i++) {
            sum += a;
            a = a*10+9;
        }
        System.out.println(sum);
    }
}

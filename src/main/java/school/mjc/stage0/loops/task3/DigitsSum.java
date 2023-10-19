package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = "" + t;
        int i;
        int sum = 0;
        int number = t;
        int digit = 0;
        for (i=0;i<str.length();i++) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        if (t<0) {
            System.out.println((-1)*sum);
        } else {
            System.out.println(sum);
        }
    }
}

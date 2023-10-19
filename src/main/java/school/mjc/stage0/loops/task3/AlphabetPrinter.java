package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        int a = (int)'a';
        int b = (int)'z';
        while (a<=b) {
            System.out.println((char)a);
            a++;
        }
    }
}

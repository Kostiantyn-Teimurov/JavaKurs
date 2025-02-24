package homeworks.homework_13;

public class Task4 {
    public static void main(String[] args) {

        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        int count = 32;

        char mySymbol1 = (char) (ch1 - count);
        ch2 -= (char) count;
        char mySymbol3 = (char) (ch3 - count);
        char mySymbol4 = (char) (ch4 - count);
        char mySymbol5 = (char) (ch5 - count);

        String result = "" + mySymbol1 + ch2 + mySymbol3 + mySymbol4 + mySymbol5;

        System.out.println(result);

    }
}

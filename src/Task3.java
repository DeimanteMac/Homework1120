/*
Write a recursive function that calculates the sum of the digits of a natural number x.

For example, if the number 1342 is passed to the function, the result should be 10.

*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(sumDigits(1342));
    }

    static int sumDigits(int x) {
        if (x == 0) {
            return 0;
        }

        return x % 10 + sumDigits(x / 10);
    }
}
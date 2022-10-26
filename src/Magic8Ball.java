import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        SelectionMadness madness = new SelectionMadness();
        // test flipcoin -- these will return true or false randomly
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

    }
}

package week11.dynamicProgramming;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Itm class to use the getWays method
        Itm itm = new Itm();

        // Define the available coin denominations
        int[] coins = {2,8,3,1};

        // Call the getWays method to compute the number of ways to make change for amount 4
        int result = itm.getWays(3, coins);

        // Print the result with expected output comparison
        System.out.println("Amount: " + 3 + ", Coins: " + Arrays.toString(coins)
            + " => Ways: " + result + " (Expected: " + 3 + ") "
            + (result == 3 ? "✅" : "❌"));
    }
}

package divided;

import static divided.MaxSubarrayDivideConquer.maxSubArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);  // 출력: 6
    }
}

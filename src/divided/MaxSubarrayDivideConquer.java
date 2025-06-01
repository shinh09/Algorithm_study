package divided;

public class MaxSubarrayDivideConquer {

    // 외부에서는 이렇게만 부르게 됨: maxSubArray(arr)
    public static int maxSubArray(int[] arr) {
        return maxSubArray(arr, 0, arr.length - 1);
    }

    // 내부 재귀 구현용 함수
    public static int maxSubArray(int[] arr, int left, int right) {
        if (left == right) return arr[left];

        int mid = (left + right) / 2;
        int leftMax = maxSubArray(arr, left, mid);
        int rightMax = maxSubArray(arr, mid + 1, right);
        int crossMax = maxCrossingSum(arr, left, mid, right);

        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    private static int maxCrossingSum(int[] arr, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }
}


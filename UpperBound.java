import java.util.Scanner;
import java.util.Arrays;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int ans = n;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = upperBound(nums, x);
        System.out.println(upperBound(nums, x));
    }
}
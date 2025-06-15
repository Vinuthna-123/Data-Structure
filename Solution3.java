import java.util.Scanner;
public class Solution3 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            insertAt(target, index[i], nums[i]);
        }
        return target;
    }
    public static void insertAt(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1]; //it shifts each element one position to the right..
        }
        arr[index] = value;// Insert value at the specified index
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            index[i] = in.nextInt();
        }
        int[] result = createTargetArray(nums, index);
        for (int num : result) {
            System.out.print(num + " ");
        }
        in.close();
    }
}
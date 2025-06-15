import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            boolean temp = false;
            for (List<Integer> row : result) {
                if (!row.contains(num)) {
                    row.add(num);
                    temp = true;
                    break;
                }
            }
            if (!temp) {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                result.add(newRow);
            }
        }

        return result;
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        List<List<Integer>> result = new Solution().findMatrix(nums);
        for (List<Integer> row : result) {
            System.out.print(row+" ");
        }
        in.close();
    }
}

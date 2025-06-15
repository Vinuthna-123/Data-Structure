import java.util.ArrayList;

class NextGreaterNumber{

    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        // Initialize result with -1 for all elements
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {

            // Check for the next greater element
            // in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result.set(i, arr[j]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 8, 0, 1, 3 };

        ArrayList<Integer> result = nextLargerElement(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

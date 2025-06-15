import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    int sum1 = 0;
    int sum2 = 0;
    
    for (int i = 0; i < arr.size(); i++) {
        sum1 += arr.get(i).get(i); //accesses the i-th element of this list, which corresponds to the element on the primary diagonal of the matrix represented by arr.
        sum2 += arr.get(i).get(arr.size() - i - 1); //accesses the element at index arr.size() - i - 1 in the i-th row. This corresponds to the element on the secondary diagonal of the matrix represented by arr.
    }
    
    return Math.abs(sum1 - sum2);
}

}
import java.util.*;

public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for (int i = 1; i < n; i++) {
            int a = i;
            for (int j = i-1; j >= 0; j--) {
                if (A[a] < A[j]) {
                    int temp = A[a];
                    A[a] = A[j];
                    A[j] = temp;
                    a = j;
                }
            }
        }
        return A;
    }
}
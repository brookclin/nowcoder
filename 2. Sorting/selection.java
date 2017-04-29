import java.util.*;

public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for (int i = 0; i < n - 1; i++) {
            int min = A[i];
            int minidx = i;
            for (int j = i; j < n; j++) {
                if (A[j] < min) {
                    min = A[j];
                    minidx = j;
                }
            }
            int temp = A[i];
            A[i] = min;
            A[minidx] = temp;
        }
        return A;
    }
}
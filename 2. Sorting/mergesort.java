import java.util.*;

public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        // write code here
        merge(A, 0, n-1);
        return A;
    }
    private void mergeArray(int[] A, int lo, int mid, int hi) {
        int[] temp = new int[hi-lo+1];
        int i = lo, j = mid+1;
        int k = 0;
        while (i <= mid && j <= hi) {
            if (A[i] < A[j])
                temp[k++] = A[i++];
            else
                temp[k++] = A[j++];
        }
        while (i <= mid) {
            temp[k++] = A[i++];
        }
        while (j <=hi) {
            temp[k++] = A[j++];
        }
        k = 0;
        for (int l = lo; l <= hi; l++) {
            A[l] = temp[k++];
        }
    }
    private void merge(int[] A, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            merge(A, lo, mid);
            merge(A, mid+1, hi);
            mergeArray(A, lo, mid, hi);
        }
    }
}
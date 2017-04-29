import java.util.*;

public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        // write code here
        sort(A, 0, n - 1);
        return A;
    }
    private int partition(int[] A, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = A[lo];
        while (true) {
            while (A[++i] < v) { //左边小于v跳过，大于v取出来交换
                if (i == hi)
                    break;
            }
            while (A[--j] > v) { //右边同理
                if (j == lo)
                    break;
            }
            if (i >= j) break; //
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        int temp = A[lo];
        A[lo] = A[j];
        A[j] = temp;
        return j;
    }
    private void sort(int[] A, int lo, int hi) {
        if (lo < hi) {
            int j = partition(A, lo, hi);
            sort(A, lo, j-1);//出错：j-1写成j, 因j已经放在对的位置，不需要再参与sort
            sort(A, j+1, hi);
        }
    }
}
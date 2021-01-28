package Elvira;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;//5
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

}

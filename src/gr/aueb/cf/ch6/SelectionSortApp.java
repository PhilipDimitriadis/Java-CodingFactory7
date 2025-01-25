package gr.aueb.cf.ch6;

public class SelectionSortApp {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 1, 2};
        int min;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }

            tmp  = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }
}

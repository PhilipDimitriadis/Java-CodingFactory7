package gr.aueb.cf.ch6.Exersices;

public class exersice5 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 7;

        int[] lowAndHigh = getLowAndHighIndexOf(arr, key);

        System.out.println("The low index is: " + lowAndHigh[0] + " and the high index is: " + lowAndHigh[1]);

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int mid = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        mid = low + 1;
        while (mid < arr.length && arr[mid++] == key) {
            high++;
        }
        return new int[] {low, high};
    }
}

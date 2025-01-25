package gr.aueb.cf.ch6.Exersices;

public class exersice1 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 8, 9, 4, 10, 2};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, 0, arr.length -1);
        int maxValue = arr[maxPosition];

        System.out.println("Max Position: " + maxPosition + " & Max Value: " + maxValue);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array length");
            return -1;
        }

        maxValue = arr[high];
        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}



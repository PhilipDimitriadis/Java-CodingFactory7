package gr.aueb.cf.ch6.Exersices;

public class exersice3 {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 6, 1, 7, 76, 2};
        int position = -1;
        boolean isPositive = false;

        position =  searchArray(arr, 7);

        if (position == -1) {
            System.out.println("Value not found");
        }
        else {
            System.out.println("Value position: " + position);
        }

        int[] doubledWorth = mapToDouble(arr);

        for (int item : doubledWorth) {
            System.out.println(item);
        }

        for (int item : arr) {
            if (item > 0) {
                isPositive = true;
                break;
            }
        }

        System.out.println("There is at least one positive integer: " + isPositive);

        System.out.println("All integers of array are positive: " + allPositive(arr));


    }

    public static int searchArray(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static void getEvens(int[] arr) {
        for (int item : arr) {
            if (item % 2 == 0) System.out.println(item);
        }
    }

    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

//        for (int item : grades) {
//            mapped[item] = grades[item] * 2;

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean anyPositive(int[] arr) {
        boolean isAnyPositive = false;

        for (int item : arr) {
            if (item > 0) {
                isAnyPositive = true;
                break;
            }
        }
        return isAnyPositive;
    }

    public static boolean allPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }

        return count == arr.length;
    }

}

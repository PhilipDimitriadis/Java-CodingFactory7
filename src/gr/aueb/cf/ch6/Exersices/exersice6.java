package gr.aueb.cf.ch6.Exersices;

public class exersice6 {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int[][] transformed;

        transformed = transformArray(arr);
    }

    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i * 2][0] = arr[i][0];
            transformed[i * 2][1] = 1;
            transformed[i * 2 + 1][0] = arr[i][1];
            transformed[i * 2 + 1][1] = 0;
        }
        return transformed;
    }

    public static int maxConcurrentCars(int[][] arr) {
        
    }
}

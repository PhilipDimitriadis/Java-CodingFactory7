package gr.aueb.cf.ch6.Exersices;

public class exersice2 {
    public static void main(String[] args) {

      int[] arr = new int[] {1, 4, 2, 6, 5, 7,8};
      int minPosition = 0;
      int secondToLastValue = arr[minPosition + 1];

      for (int i = 1; i < arr.length; i++) {
          if (arr[i] < secondToLastValue) {
              minPosition = i;
              secondToLastValue = arr[minPosition];
          }
      }

        System.out.println("Second to Last Value: " + secondToLastValue);
    }
}

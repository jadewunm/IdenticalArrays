import java.util.Scanner;

public class IdenticalArrays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Initialize two 3x3 arrays
    int[][] list1 = new int[3][3];
    int[][] list2 = new int[3][3];

    // Prompt user to enter the first 3x3 array
    System.out.print("Enter list1: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list1[i][j] = input.nextInt();
      }
    }

    // Prompt user to enter the second 3x3 array
    System.out.print("Enter list2: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list2[i][j] = input.nextInt();
      }
    }

    // Check if the arrays are identical
    if (equals(list1, list2)) {
      System.out.println("The two arrays are identical");
    } else {
      System.out.println("The two arrays are not identical");
    }
    input.close(); // Close the scanner to prevent resource leak
  }

  // Method to check if two 2D arrays are identical
  public static boolean equals(int[][] m1, int[][] m2) {
    // Check if both arrays have the same dimensions
    if (m1.length != m2.length) {
      return false;
    }

    for (int i = 0; i < m1.length; i++) {
      if (m1[i].length != m2[i].length) {
        return false;
      }
      for (int j = 0; j < m1[i].length; j++) {
        if (m1[i][j] != m2[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
}
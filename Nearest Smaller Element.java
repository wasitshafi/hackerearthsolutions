/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

import java.util.*;

class TestClass {
  public static void main(String[] args)
  {
    int n;
    int[] arr;
    int[] ans;
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    arr = new int[n];
    ans = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      ans[i] = arr[i];
      for (int j = i - 1; j >= 0 ; j--) {
        if (arr[j] < ans[i]) {
          ans[i] = arr[j];
          break;
        }
      }
      if(ans[i] == arr[i]) {
          ans[i] = -1;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(ans[i]);
      if (i + 1 != n) {
        System.out.print(" ");
      }
    }
  }
}
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
    Stack<Integer> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    
    n = scanner.nextInt();
    arr = new int[n];
    ans = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
      while(!stack.isEmpty() && stack.peek() >= arr[i])
      {
        stack.pop();
      }

      if (stack.isEmpty()) {
        ans[i] = -1;
      } else {
        ans[i] = stack.peek();
      }
      stack.push(arr[i]);
    }

    for (int i = 0; i < n; i++) {
      System.out.print(ans[i]);
      if (i + 1 != n) {
        System.out.print(" ");
      }
    }
  }
}
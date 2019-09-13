import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in  = new Scanner(System.in);
      int n = in.nextInt();
      int t=n;
      for(int curr_row = 1; curr_row <= n; curr_row++)
      {
        for(int curr_col = t; curr_col >= 1; curr_col--)
        {
          System.out.print(curr_col);
        }
        t--;
        System.out.print("\n");
      }
    }
}
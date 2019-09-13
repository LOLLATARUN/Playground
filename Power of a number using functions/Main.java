import java.util.Scanner;
class Main
{
  public static int powerofnum(int base, int exp)
  {
    int power=1;
    while(exp>=1)
    {
      power=power*base;
      exp--;
    }
      return power;
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int a= in.nextInt();
    int b= in.nextInt();
    int ans= powerofnum(a,b);
    System.out.print(ans);
	}
}
    
    
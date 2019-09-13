import java.util.Scanner;
class Main
{
  public static int squareofnumber(int a)
  {
    int square= a*a;
    return square;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(squareofnumber(n));
	} 
}
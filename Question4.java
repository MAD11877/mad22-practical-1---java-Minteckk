import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int b = in.nextInt();

    for(int i = b; i < 5; i++)
    {
      for(int a = 0; a < i; a++)
      {
      System.out.print("*");
    }
      System.out.println("");
  }
  }
}

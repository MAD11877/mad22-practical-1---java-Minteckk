import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    ArrayList<Integer> numbers = new ArrayList<>();
    
    for(int i = 0; i < num; i++)
       {
      int a = in.nextInt();
      numbers.add(a);
       }

    int HighestNumber = -1;
    int MaximumOccurence = -1;

    for(int c = 0; c < num ; c++)
      {
        int count = 0;
        
        for(int b = 0; b < num; b++)
        {
          if (numbers.get(c) == numbers.get(b))
          count++;

        }
        if (count > MaximumOccurence)
           HighestNumber = numbers.get(c);
           MaximumOccurence = count;
      }
      System.out.println(HighestNumber);
    }
  }


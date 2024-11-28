import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int a[]=new int[5];
      int tem=0;
      for(int i=0;i<=4;i++)
      {
        a[i]=scan.nextInt();
        tem+=a[i];
      }
      tem/=5;
      if(90<=tem)
      {
      System.out.println("A");
      }
      else if(80<=tem && tem<90)
      {
      System.out.println("B");
      }
      else if(70<=tem && tem<80)
      {
      System.out.println("C");
      }
      else if(50<=tem && tem<70)
      {
      System.out.println("D");
      }
      else
      {
        System.out.println("F");
      }
  }
}

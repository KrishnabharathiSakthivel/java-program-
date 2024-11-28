import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      
      if( n%3==0 && n%5==0 )
      {
        System.out.println("HelloWorld");
      }
      else if(n%3==0)
      {
        System.out.println("Hello");
      }
      else if(n%5==0)
      {
        System.out.println("World");
      }
      else{
          System.out.println(n);
      }
      
      scan.close();
  }
}

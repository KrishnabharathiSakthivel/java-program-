import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int o=2;
      if(n/2*2==n)
      {
        o++;
      }
      switch(o)
      {
      case 3:
        System.out.println("EVEN");
        break;
      case 2:
        System.out.println("ODD");
        break;
      default:
        System.out.println("samething worng");
        break;
      }
  }
}

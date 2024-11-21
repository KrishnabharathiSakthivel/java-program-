import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[20];
    int sum=0;
    for(int i= 0 ;i<10;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<10;i++)
    {
      for(int j=0;j<10;j++)
      {
        if(a[i]<a[j])
        {
          sum=a[i];
          a[i]=a[j];
          a[j]=sum;
        }
      }
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(a[i]);
    }
  }
}

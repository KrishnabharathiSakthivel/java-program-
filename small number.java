import java.util.Scanner;
public class Main
{
  static void arra(int []arraysh , int n)
    {
        int tem=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arraysh[i]>arraysh[j])
                {
                    tem=arraysh[i];
                    arraysh[i]=arraysh[j];
                    arraysh[j]=tem;
                }
            }
        }
            System.out.println(arraysh[1]);
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//shortarray r1=new shortarray();
		//int n=scan.nextInt();
		int n=3;
		int []arraysh=new int[n];
		for(int k=0;k<n;k++)
		{
		    arraysh[k]=scan.nextInt();
		}
//	r1.arra(arraysh,n);
	arra(arraysh,n);
	}
}

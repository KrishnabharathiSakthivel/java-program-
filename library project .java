import java.util.*;
class Com
{
    ArrayList<String> l=new ArrayList<String>();
    ArrayList<String> l3=new ArrayList<String>();
    ArrayList<String> ar=new ArrayList<String>();
    ArrayList<String> du=new ArrayList<String>();
    ArrayList<String> du1=new ArrayList<String>();
    ArrayList<String> pd=new ArrayList<String>();
    ArrayList<String> pd1=new ArrayList<String>();
    String g,s1,s2;
    int i,cl=0,d=0;
    Scanner sc=new Scanner(System.in);
    int f=0,g1=1,rt=0,ad=0,is=0;
    void view()
    {
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("java");
        l1.add("c++");
        this.l3=l1;
        for(String s:l1)
            System.out.println(s);
            
    }
    public void view1()
    {
        cl=0;
        if(f==0)
        {
        view();
        ad=1;
        }
        else if(f==1)
        {
            ar.addAll(l3);
            ar.addAll(l);
            l3.clear();
            l.clear();
            for(String j:ar)
            System.out.println(j);
        }
        else if(f==2)
        {
            for(String s:l3)
            System.out.println(s);
        }
        else if(f==3)
        {
            for(String s:l3)
            System.out.println(s);
        }
    }
     public void get()
     {
         if(g1==1)
         {
        l3.addAll(ar);
        ar.clear();
        System.out.print("Which books are you get?");
        this.g=sc.next();
        this.i=l3.indexOf(g);
        if(i==-1)
        {
            System.out.println("Please Enter Valid Book Name!");
        }
        else
        {
        l3.remove(i);
        f=2;
        g1=0;
        }
        
         }
         else
         {
             System.out.println("First Return Your Book"+" "+g);
         }
         
    
     }
     public void ret()
     {
         
         if(f==2)
         {
         l3.add(i,g);
         System.out.println("Thank You for your return book"+" "+g);
         is=1;
         f=3;
         g1=1;
         }
         else 
         {
             System.out.println("First Get Your Books");
             
         }
         
     }
     public void crstu()
     {
              System.out.print("Name: ");
              String n=sc.next();
              System.out.print("Password: ");
              String p=sc.next();
              this.s1=n;
              this.s2=p;
              if(p.length()==5)
              {
                  System.out.println("Successfully Created");
                  {
                      clog();
                      if(d==1)
                      {
                          du1.addAll(du);
                          du.clear();
                          pd1.addAll(pd);
                          pd.clear();
                          
                      }
                  }
              }
              else
              {
                  System.out.println("Only Password Contains 5 Characters only");
              }
     }
      public void clog()
      {
          ArrayList<String> a=new ArrayList<String>();
          a.add(s1);
          ArrayList<String> a1=new ArrayList<String>();
          a.add(s2);
          du=a;
          pd=a1;
          d=1;
      }
}
class Add extends Com
{
    int x,x1,h3=1,fl=0,b1=1,b2=1;;
    public void abk()
    {
        if(ad==1)
        {
        ArrayList<String> k=new ArrayList<String>();
        String s1=sc.next();
        k.add(s1);
        l=k;
        f=1;
        }
        else 
        {
            System.out.println("First View Your Books");
    }
    }
    public void lslog()
    {
        
        while(b1>0)
        {
        System.out.println("1.Librarian 2.Student 3.Exit");
        int c=sc.nextInt();
        if(c==1)
        {
            while(b2>0)
            {
          System.out.println("1.Login 2.Exit"); 
          int k=sc.nextInt();
          if(k==1)
          {
              System.out.print("Name: ");
              String s3=sc.next();
              System.out.print("Password: ");
              String s1=sc.next();
              if(s1.equals("admin"))
              {
                  System.out.println("Successfully Login");
                      chk();
              }
              else
              {
               System.out.println("Please enter valid Password");   
              }
          }
          else if(k==2)
          {
              b2--;
          }
        }
        b2=1;
        }
        else if(c==2)
        {
            crechk();
          
         }
       else if(c==3)
      {
          System.out.println("Thank You for visiting my library!");
           --b1;
           if(fl==1)
           {
               h3=0;
               
           }
          
      }
        }
        
    }
    public void crechk()
    {
        
        while(h3>0)
            {
          System.out.println("1.Create Account 2.Login 3.Exit"); 
          int c11=sc.nextInt();
            if(c11==1)
            {
                
                crstu();
                
            }
            else if(c11==2)
            {
                stlog();
        
            }
            else if(c11==3)
            {
                h3--;
            }
          }
          
    }
   
    public void chk()
    {
        int b=1;
        while(b>0)
        {
            
        System.out.println("1.View 2.Add 3.Issued Book 4.Exit");
        int n=sc.nextInt();
        if(n==1)
        {
            view1();
        }
        if(n==2)
        {
            if(cl==0)
            {
            abk();
            cl=1;
            }
            else 
            {
                System.out.println("First View Your Books");
            }
        }
        if(n==3)
        {
            if(g==null)
            {
                System.out.println("No Issued Books");
            }
            else if(g!=null&&is==0)
            {
                System.out.print("g is"+" "+g+" "+is);
                System.out.println("Issued Book is"+" "+g);
            }
            else if(is==1)
            {
                System.out.println("No Issued Books");
            }
        }
        if(n==4)
        {
            b--;
        }
        }
    }
     public void stlog()
     {
              System.out.print("Name: ");
              String n1=sc.next();
              System.out.print("Password: ");
              String p1=sc.next();
              x=du1.indexOf(n1);
              x1=du1.indexOf(p1);
             if(x+1==x1)
             {
                 System.out.println("Successfully Login");
                 {
                     fl=1;
                     st();
                 }
            
             }
             else
             {
                 System.out.println("Please enter valid Password/username!");
             }
     }
    public void st()
    {
        int n=1;
        while(n>0)
        {
            System.out.println("1.View Book 2.Get Book 3.Return Book 4.Exit");
            int s=sc.nextInt();
            if(s==1)
            {
                view1();
            
            }
            if(s==2)
            { 
                view1();
                get();
               
            }
            if(s==3)
            {
                ret();
            }
            if(s==4)
            {
                n--;
                lslog();
            }
        }
        
    }
    }

public class Main
{
	public static void main(String[] args)
	{
	    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ KRISHNA LIBRARY $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	    Add ad=new Add();
	    ad.lslog();
	}
}

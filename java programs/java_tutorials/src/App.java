import java.util.*;
/*public class App {
    /*public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

       
      
    }
    
    
}

        /*int space = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print("*");

            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space+=2;
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }
        space = 2*(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");

            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space-=2;
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");

            }

            System.out.println();
        }
        
       
    }
}*/
import java.math.*;
class App{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int total = 2*n;
        for(int i=0;i<=total;i++)
        {
            for(int j=0;j<=total;j++)
            {
                
                System.out.print(total-(Math.min(Math.min(i,j),Math.min(total - i,total -j))));
            }
            System.out.println();

        }
    }
}


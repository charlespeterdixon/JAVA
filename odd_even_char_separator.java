import java.util.*;

public class odd_even_char_separator {

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        n++;
        //System.out.println("Enter words");
        int i;
        String element="";
        for (i=0;i<n;i++)
        {
            if(i!=0)
            element = "_"+sc.nextLine()+element;
            else
            element = sc.nextLine()+element;
        }
        String arr[] = element.split("_", n);
        //System.out.println(arr[n-1]);
        for (i=n-1;i>=0;i--)
        {
            //System.out.println(arr[i]+" pos "+i);
            if (i==0)
            {
                break;
            }
            prnt(arr[i]);
        }
        sc.close();
    }
    public static void prnt(String l) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            //Scanner sc = new Scanner (System.in);
            
            //String l = sc.nextLine();
            //sc.close();
            String even = "",odd="";
            
            int t = 0;
            
            while(t!=l.length())
            {
                if (t==0 || t%2==0)
                        even = even+l.charAt(t);
                else
                        odd = odd+l.charAt(t);
                t++;
            }
            
            System.out.println(""+even+" "+odd+"");
        }
    }

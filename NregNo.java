package cgprasanthGuvi;
import java.util.Scanner;
import java.util.Arrays;
public class NregNo {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        Arrays.sort(ar);
        String num="";
        for(int i=n-1;i>=0;i--)
            num=num+Integer.toString(ar[i]);
        System.out.println(num);
     }
	}



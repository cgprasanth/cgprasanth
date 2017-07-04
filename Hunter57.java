package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter57 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int l=ss.nextInt();
		int[] arr=new int[l];
		for(int i=0;i<l;i++){
			arr[i]=ss.nextInt();
		}
		int[] count=new int[l];
		for(int i=0;i<l-1;i++){
			for(int j=i+1;j<l;j++){
				if(arr[i]==arr[j]){
                count[i]++;
                count[j]='\0';
                arr[j]='\0';
			    }
			}
		}
		for(int j=0;j<count.length;j++){
			if(count[j]==0){
			  System.out.println(arr[j]);
			  break;
		    }
		    else{
			     continue;
			}
		}
		
	}
}

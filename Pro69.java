package pro;

public class Pro69 {
	public static void userMethod(String input){
	    String t="";
	    String s;
	    int Msum1=0;
	    int msum1=1;
	    int Msum2=0;
	    int msum2=0;
	    int sum1=0;
	    int sum2=0;
	    for(int i=0;i<input.length();i++){
	       s=""+input.charAt(i);
	       char c=s.charAt(0);
	       int a=(int) c;
	       if(a>=48&&a<=57){
		   t=t+s;
	       }
	    }
	    int max=Integer.parseInt(t.substring(0,1));
	    int min=Integer.parseInt(t.substring(0,1));
	    s=t.substring(1,t.length());
	  for(int i=0;i<t.length();i++){
		  int temp=(int) t.charAt(i)-48;
		  if(temp>max){
			  max=temp;
		  }
		  else{
			  max=max;
		  }
		  if(temp<min){
			  min=temp;
		  }
		  else{
			  min=min;
		  }
	   }
	 for(int i=0;i<t.length();i++){
		 int a=(int) t.charAt(i)-48;
		 Msum1=(a*max)+Msum1;
		 msum1=(a+min)*msum1;
	 }
	 while(Msum1>0){
		 int a=Msum1%10;
		 int b=Msum1/10;
		 Msum2=Msum2+a;
		 Msum1=b;
	 }
	 while(Msum2>0){
		 int a=Msum2%10;
		 int b=Msum2/10;
		 sum1=sum1+a;
		 Msum2=b;
	 }
	 while(msum1>0){
		 int a=msum1%10;
		 int b=msum1/10;
		 msum2=msum2+a;
		 msum1=b;
	 }
	 while(msum2>0){
		 int a=msum2%10;
		 int b=msum2/10;
		 sum2=sum2+a;
		 msum2=b;
	 }
	 if(sum1<sum2){
		 System.out.println("Expected output is = "+(sum1*sum1));
	 }
	 else{
		 System.out.println("Expected output is = "+(sum2*sum2));
	 }
	}
 public static void main(String[] args){
	 userMethod("34#2a3");
 }
}

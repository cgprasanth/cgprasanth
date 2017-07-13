package hunter;

public class Hunter134 {
	public static void usermethod(int input1,int input2){
		int a = 0;
		int b = 1;
		int count1=0;
		int count2=0;
		for(int i=2;i<=input1;i++){
			if(input1%i==0){
				count1++;
			}
		}
		if(count1==1){
			a=1;
		}
		else{
			a=0;
		}
		for(int i=2;i<=input2;i++){
			if(input2%i==0){
				count2++;
			}
		}
		if(count2==1){
			b=1;
		}
		else{
			b=0;
		}
		if(a==1&&b==1){
			System.out.println("CoPrime");
		}
		else{
			System.out.println("Not a Coprime");
		}
	}
	public static void main(String[] args){
		usermethod(2,3);
	}

}

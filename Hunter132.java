package hunter;

public class Hunter132 {
	public static void usermethod(int input){
		String a="*";
		String b="";
		for(int i=input;i>0;i--){
			int j=input;
			b="";
		    for(j=j;j>0;j--){
			   b=b+a;	
            }
		    for(int k=0;k<2;k++){
			   System.out.print(b+" ");
		    }
		    System.out.println();
		    input=input-1;;
		}
	}
	public static void main(String[] args){
		usermethod(3);
	}

}

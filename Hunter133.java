package hunter;

public class Hunter133 {
	public static void usermethod(String s){
		String[] arr=s.split(" ");
		String out="";
		for(int i=arr.length-1;i>=0;i--){
			out=out+arr[i]+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args){
		usermethod("hello world");
	}

}

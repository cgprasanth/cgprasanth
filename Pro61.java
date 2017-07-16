package pro;

public class Pro61 {
	public static String output;
	public static void userMethod(String input1,String input2){
		String temp1=input1.toLowerCase();
		String a=input2.substring(1,input2.length()-1);
		String temp2=a.toLowerCase();
		String temp3="";
		String temp4="";
		char[] c1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] c2={'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j'};
		for(int i=0;i<input1.length();i++){
			char c=temp1.charAt(i);
			for(int j=0;j<26;j++){
				if(c==c1[j]){
					if(input1.charAt(i)>97){
						temp3=temp3+c2[j];
					}
					else{
						String t="";
						t=t+c2[j];
						temp3=temp3+t.toUpperCase();
					}
				}
			}
		}
		for(int i=0;i<temp2.length();i++){
			char c=temp2.charAt(i);
			for(int j=0;j<26;j++){
				if(c==c1[j]){
					if(a.charAt(i)>=97){
						temp4=temp4+c2[j];
					}
					else{
						String t="";
						t=t+c2[j];
						temp4=temp4+t.toUpperCase();
					}
				}
			}
		}
		output=temp3+" "+input2.charAt(0)+temp4+input2.charAt(input2.length()-1);
	}
	
    public static void main(String[] args){
    	userMethod("code","kata");
    	System.out.println(output);
    }
}

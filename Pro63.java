package pro;

import java.util.ArrayList;

public class Pro63 {
	public static void userMethod(String input){
		
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
	    for(int i=1;i<=input.length();i++){
		    for(int j=0;j<=input.length()-i;j++){
			    String t=input.substring(j,j+i);
			    a.add(t);
		    }
	    }
	    for(int i=0; i<a.size();i++){
	    	int count=0;
		    String temp=a.get(i).toString();
		    for(int j=0;j<temp.length()-1;j++){
		    	for(int k=j+1;k<temp.length();k++){
		    		if(temp.charAt(j)==temp.charAt(k)){
		    			count++;
		    		}
		    		else{
		    			count=count;
		    		}
		    	}
		    }
		    if(count==0){
		    	b.add(temp);
		    }
	    }
	    System.out.println(b.get(b.size()-1));
	}
	public static void main(String[] args){
		userMethod("abcabcbb");
	}

}

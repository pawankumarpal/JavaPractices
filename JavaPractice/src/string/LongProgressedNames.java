package string;


public class LongProgressedNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "leelee";
		String typed= "lleeellleee";
		
		LongProgressedNames lg = new LongProgressedNames();
		System.out.println(lg.isLongPressedName(name, typed));
	}
    public boolean isLongPressedName(String name, String typed) {
        int len= name.length();
        int typedLen = typed.length();
        int i=0;
        int k=0;
        for(;i<len;i++){
    		if(i<len-2) {
            	while( i<len && name.charAt(i)==name.charAt(i+1)) {
            		if(i==len-1) {
            			break;
            		}
            		i++;
            	}
    		}
            for(int j=k;j<typedLen;j++){
                if(name.charAt(i)==typed.charAt(j)){
                    
                }else if(j!=0 && name.charAt(i+1)==typed.charAt(j)){
                	k=j;
                    break;
                }else if(i==len-1 && typed.charAt(j) !=name.charAt(i)){
                    return false;
                }else if(j!=typedLen-1 && name.charAt(i)==typed.charAt(j) && name.charAt(i)!=typed.charAt(j+1)){
                    break;
                } 
                else {
                	return false;
                }
                if(i==len-1 && j==typedLen-1){
                    return true;
                }
            }
        }
        return false;
    }

}

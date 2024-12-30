package string;

public class FindPatternInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPatternInString fps = new FindPatternInString();
		String s = "aaaaaa";
		String t = "bbaaaa";
      if(t.isEmpty() && !s.isEmpty()) System.out.println(false);
      else if(s.isEmpty() && !t.isEmpty()) System.out.println(true);
      else if(s.isEmpty() && t.isEmpty()) System.out.println(true);
      else
        System.out.println(fps.isSubsequence(s,t));
	}
    public boolean isSubsequence(String s, String t) {
    	int j=0;
    	for(int i=0;i<t.length();i++) {
    		if(j==s.length()-1 && s.charAt(j)==t.charAt(i)) return true;
    		if(s.charAt(j)==t.charAt(i)) {
    			j++;
    		}
    	}
    	return false;
//        if(t.isEmpty() && !s.isEmpty()) return false;
//        else if(s.isEmpty() && !t.isEmpty()) return true;
//        else if(s.isEmpty() && t.isEmpty()) return true;
//        else
//        return checkSequence(s,t,0,0,0);
    }
//    public boolean checkSequence(String s, String t,int i, int j,int count){
//        if(count == s.length()-1){
//            return true;
//        }
//        if((i == s.length() && j == t.length())|| i<s.length() && j == t.length()-1){
//            return false;
//        }
//        if(s.charAt(i)==t.charAt(j)){
//        	count++;
//            i++;
//            j++;
//            return checkSequence(s,t,i,j,count);
//        }else{
//            j++;
//            return checkSequence(s,t,i,j,count);
//        }
//    }

}

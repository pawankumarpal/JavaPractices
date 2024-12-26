package string;

public class FindFirstRepeatingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFirstRepeatingElem ff = new FindFirstRepeatingElem();
		String s = "geeksforgeek";
		System.out.println(ff.findFirst(s));

	}
	
	public String findFirst(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					//System.out.println(s.charAt(i)); 
					return s.charAt(i)+"";
				}
			}
		}
		return "";
	}

}

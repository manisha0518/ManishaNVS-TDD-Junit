package tdd;
public class TDDTest {
	
	public String removeA(String str) {
		int len = str.length();
		String result="";
		
		if(len >= 1 && str.charAt(0) != 'A' && str.charAt(0) != 'a'){
			result += str.charAt(0);
		}
		
		if(len >= 2 && str.charAt(1) != 'A' && str.charAt(1) != 'a'){
			result += str.charAt(1);
		}
		
		if(len > 2) {
			result += str.substring(2);
		}
		
		return result;
	}
	
}

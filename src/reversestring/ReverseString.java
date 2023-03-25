package reversestring;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Codoid Innovations";
		int len=str.length();
		System.out.println(len);
		
		char[] charArray01 = str.toCharArray();
		
		for (int i=len-1;i>=0;i--) {
			System.out.print(charArray01[i]);
	}

	}
}

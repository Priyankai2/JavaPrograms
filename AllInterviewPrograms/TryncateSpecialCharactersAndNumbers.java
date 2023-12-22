package AllInterviewPrograms;

public class TryncateSpecialCharactersAndNumbers {
	
	public static void main(String[] args) {
		
		String s = "Te$t!n9";
		System.out.println("Actual String = "+ s);
		String regx = "[^a-zA-Z]";
		s = s.replaceAll(regx, "");
		System.out.println("Expected String = "+ s);
		
		
		
	}
	
}

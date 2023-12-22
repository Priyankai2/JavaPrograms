package AllInterviewPrograms;

public class ReplaceSpecialCharacterUsingRegex {
	public static void main(String[] args) {

		String str = new String("C@unter$ign Te&hnolo#y");
		System.out.println("Actual String   = " + str);
		str = str.replaceAll("[\\W]", "X");          // standard format in java to replace special characters  using Regex
		System.out.println("Expected String = " + str);
		
		
		
		
	}

}

//for Special character = [^\\w] or [\\W]
//for character and numbers = [\\w] or [^\\W]
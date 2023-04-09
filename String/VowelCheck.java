public class VowelCheck {
    
    public static void main(String[] args) {
       // String str = "veena";
		System.out.println(stringContainsVowels("veena")); // true
		//System.out.println(stringContainsVowels("TV")); // false
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}

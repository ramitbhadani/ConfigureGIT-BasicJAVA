package javaconcepts;

public class strings {
	
	public static String   str1 = "Configure-GIT-with-Jenkins";
	public static String   str2 = "JAVA String Methods"; 
	public static String   str3 = "JAVA String Methods"; 
	public static void main(String[] args) {
		String[] str1Split = str1.split("[-]");
		String[] str2Split = str2.split("\\s");
		for(int i=0;i<str1Split.length;i++) {
			String a1 = str1Split[i];
			System.out.println("Length of "  +a1 +    " is "    + a1.length());
			System.out.println(a1.charAt(2));
		//	System.out.println(str1Split[i]);
		}
		for(int i=0;i<str2Split.length;i++) {
			String a1 = str2Split[i];
			System.out.println("Length of "  +a1 +    " is "    + a1.length());
		//	System.out.println(str2Split[i]);
		}
		String concatStrings = str1.concat(" " +str2);
		if(concatStrings.contains("Java")) {
		System.out.println("This will concat the Strings " +concatStrings );
		}
		else {
			System.out.println("Else This will concat the Strings ==> " +concatStrings );
		}
		System.out.println("Starts With Function  " +str2.startsWith("Configure"));
		System.out.println("Ends With Function   " +str2.endsWith("Methods"));
		String type = str3.toUpperCase();
		System.out.println("Ignore Case With Function   " +str2.equalsIgnoreCase(typ));
	}

}
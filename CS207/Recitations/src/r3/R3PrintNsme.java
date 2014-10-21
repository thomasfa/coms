package r3;

public class R3PrintNsme {
	public static void main(String[] args){
		String firstName;
		String lastName;
		firstName="John";
		lastName="Atanasoff";
		String fullName;
		fullName= firstName+" "+lastName;
		System.out.println(fullName);
		int firstLen= firstName.length();
		int lastLen= lastName.length();
		int fullLen= fullName.length();
		System.out.println(firstLen);
		System.out.println(lastLen);
		System.out.println(fullLen);
		String str1= firstName.substring(0,3);
		String str2= lastName.substring(1,7);
		System.out.println(str1);
		System.out.println(str2);
	}
}

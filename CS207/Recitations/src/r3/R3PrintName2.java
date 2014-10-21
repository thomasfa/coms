package r3;

public class R3PrintName2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		firstName="Thomas";
		lastName="Alexander";
		String fullName;
		fullName= firstName+" "+lastName;
		System.out.println(fullName);
		int firstLen= firstName.length();
		int lastLen= lastName.length();
		int fullLen= fullName.length();
		System.out.println(firstLen);
		System.out.println(lastLen);
		System.out.println(fullLen);
	}

}

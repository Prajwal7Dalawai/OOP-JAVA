package classesAndObjects;

public class builtInFunctions {

	public static void main(String[] args) {
		//direct assigning
		String s1 = "Hello";
		
		//through char array
		char c[] = {'J','A','V','A'};
		String s2 = new String(c);
		
		System.out.println("Length of String s1:"+s1);
		System.out.println("Equality of s1 and s2 = "+s1.equals(s2));
		
		String s4  = s1.toUpperCase();
		System.out.println("Equality of two Strings s1 and s4[case insensitive]:"+s1.equalsIgnoreCase(s4));
		String s5 = "  Java world welcomes you  ";
		System.out.println("s5"+" after trimming: "+s5.trim());
		System.out.println("Combined s1 and s2: "+s1.concat(" ").concat(s2));
		System.out.println("Index of 'l' in " + s5+" :"+s1.indexOf('l'));
		System.out.println("Substring from index 2 in "+s5+" is "+s5.substring(2));
		System.out.println("Substring from index 2 to index 6 in "+s5.substring(2, 6));
		
		String s3[]= s5.split(" ");
		System.out.println(s5+" After split:\n");
		for(int i=0;i<s3.length;i++) {
			System.out.println(s3[i]);
		}
	}

}

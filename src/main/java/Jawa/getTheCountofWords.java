package Jawa;

public class getTheCountofWords {

	public static void main(String[] args) {
		
		String text="Amazon has working 20,000          people in India";
		String replaceAll = text.replaceAll("\\s+", " ");
		System.out.println(replaceAll);
		String[] split = replaceAll.split(" ");
		System.out.println(split.length);
	}

}

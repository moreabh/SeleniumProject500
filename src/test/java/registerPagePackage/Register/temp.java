package registerPagePackage.Register;

import java.time.LocalDateTime;

public class temp {
	
	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoHyphen = dateToString.replace("-", "");
		String dateNoColon = dateNoHyphen.replaceAll(":","");
		String finalDate = dateNoColon+"@gmail.com";
		
		System.out.println(finalDate);
		
	}

}

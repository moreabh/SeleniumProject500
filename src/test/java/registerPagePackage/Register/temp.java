package registerPagePackage.Register;

import java.time.LocalDateTime;

public class temp {
	
	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoColon = dateToString.replace(":", "");
		String dateNoHyphen = dateNoColon.replace("-", "");
		String dateFinal = dateNoHyphen+"@gmail.com";
		System.out.println(dateFinal);
		
	}

}

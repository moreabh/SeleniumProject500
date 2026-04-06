package utils;

import java.time.LocalDateTime;

public class CommonUtils {
	
public static  String generateNewEmail() {
		
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoColon = dateToString.replace(":", "");
		String dateNoHyphen = dateNoColon.replace("-", "");
		String dateFinal = dateNoHyphen+"@gmail.com";
		return dateFinal;
	}

}

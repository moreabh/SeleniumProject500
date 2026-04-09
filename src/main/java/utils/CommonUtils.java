package utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CommonUtils {
	
		public static  String generateNewEmail() {
				
				LocalDateTime date = LocalDateTime.now();
				String dateToString = date.toString();
				String dateNoColon = dateToString.replace(":", "");
				String dateNoHyphen = dateNoColon.replace("-", "");
				String dateFinal = dateNoHyphen+"@gmail.com";
				return dateFinal;
			}

		public static boolean compareTwoScreenshots(String actualImagePath, String expectedImagePath) throws IOException {
			
			BufferedImage actualBufferedImage = ImageIO.read(new File(actualImagePath));
			BufferedImage expectedBufferedImage = ImageIO.read(new File(expectedImagePath));
			
			ImageDiffer imgDiffer = new ImageDiffer();
			ImageDiff imgDifference = imgDiffer.makeDiff(expectedBufferedImage, actualBufferedImage);
			
			return imgDifference.hasDiff();
			}

}

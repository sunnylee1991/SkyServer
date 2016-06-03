package kit.labcourse.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import kit.labcourse.transformations.FGetNearbyObjEq;
import kit.labcourse.transformations.FPhotoFlags;

public class MainClass {

	public static void main(String[] args) {
		try {
			BufferedReader fileWithFunc = new BufferedReader(new FileReader(new File(".\\testSample.csv")));
			BufferedWriter transformedFile = new BufferedWriter (new FileWriter (new File(".\\transformed.csv"), true));
			
			String line = "";
			String newLine = "";
			
			while((line = fileWithFunc.readLine()) != null) {
				if (line.contains("fphotoflags"))
					newLine = FPhotoFlags.transform(line);
				else if (line.contains("fgetnearbyobjeq"))
					newLine = FGetNearbyObjEq.transform(line);
				else
					newLine = line;
				if (!newLine.isEmpty())
					transformedFile.write(newLine + "\n");
			}
			
			fileWithFunc.close();
			transformedFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the first task!");
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

package kit.labcourse.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import kit.labcourse.filters.FilterForFourthTask;
import kit.labcourse.filters.FilterForSecondTask;

public class MainClass {

	public static void main(String[] args) {
		try {
			BufferedReader readFirstTask = new BufferedReader(new FileReader(new File(".\\firstTaskStatements_clean_nq.csv")));
			FilterForSecondTask.filter(readFirstTask);
			
		//	BufferedReader readFourthTask = new BufferedReader(new FileReader(new File(".\\fourthTaskNonprocessedSecond.csv")));
		//	FilterForFourthTask.filter(readFourthTask);
		} catch (FileNotFoundException e) {
			System.out.println("Problem with opening the first task!");
			e.printStackTrace();
		}

	}

}

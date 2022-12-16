import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalScore {
	
	public static double GetFinalScore() throws FileNotFoundException{
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the name of the student that you are trying to get the final score for?");
		String nameOfStudent = scnr.next();
		double homeworkScore = TheFirstFile(nameOfStudent);
		double quizScore = TheSecondFile(nameOfStudent);
		double examScore = TheThirdFile(nameOfStudent);
		double theFinalExamScore = TheFourthFile(nameOfStudent);
		
		double finalScoreOfClass = (quizScore *.20) + (homeworkScore *.30) + (examScore *.20) + (theFinalExamScore * .30);
		scnr.close();
		return finalScoreOfClass;
	}
	
	public static double TheFirstFile(String theNameOfStudent) throws FileNotFoundException{
		File homework = new File ("ImportFile1.txt");
		Scanner readHomework = new Scanner(homework);
		Scanner scanner = new Scanner (System.in);
		//Reading the file and finding out if the student has a score already 
		String str;
		double oldScore;
		String prison;
		while (readHomework.hasNextLine()) {
			prison = readHomework.nextLine();
			str = prison.replaceAll("[^\\d.]", "");
			str = str.trim();
	         if (str == theNameOfStudent) {
	            	 try {
	            		 oldScore = Double.parseDouble(prison);
	            		 return oldScore;
	            	 }
	            	 catch (NumberFormatException k){
	            		 System.out.println("There is no score for this");
	            		 break;
	            	 }
	         }
	    }
		//if Double.parseDouble(prison) doesn't have a value, the programs will ask the score for whatever category
		double score = 0;
   		System.out.println("There is no score for " + theNameOfStudent);
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
		return score;
   	 	}
	
	public static double TheSecondFile(String theNameOfStudent) throws FileNotFoundException{
		File quiz = new File ("ImportFile2.txt");
		Scanner readQuiz = new Scanner(quiz);
		Scanner scanner = new Scanner (System.in);
		//Reading the file and finding out if the student has a score already 
		String str;
		double oldScore;
		String prison;
		while (readQuiz.hasNextLine()) {
			prison = readQuiz.nextLine();
			str = prison.replaceAll("[^\\d.]", "");
			str = str.trim();
	         if (str == theNameOfStudent) {
	            	 try {
	            		 oldScore = Double.parseDouble(prison);
	            		 return oldScore;
	            	 }
	            	 catch (NumberFormatException k){
	            		 System.out.println("There is no score for this");
	            		 break;
	            	 }
	         }
	    }
		//if Double.parseDouble(prison) doesn't have a value, the programs will ask the score for whatever category
		double score = 0;
   		System.out.println("There is no score for " + theNameOfStudent);
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
		return score;
   	 	}
	
		public static double TheThirdFile(String theNameOfStudent) throws FileNotFoundException{
			File exam = new File ("ImportFile3.txt");
			Scanner readExam = new Scanner(exam);
			Scanner scanner = new Scanner (System.in);
			//Reading the file and finding out if the student has a score already 
			String str;
			double oldScore;
			String prison;
			while (readExam.hasNextLine()) {
				prison = readExam.nextLine();
				str = prison.replaceAll("[^\\d.]", "");
				str = str.trim();
		         if (str == theNameOfStudent) {
		            	 try {
		            		 oldScore = Double.parseDouble(prison);
		            		 return oldScore;
		            	 }
		            	 catch (NumberFormatException k){
		            		 System.out.println("There is no score for this");
		            		 break;
		            	 }
		         }
		    }
			//if Double.parseDouble(prison) doesn't have a value, the programs will ask the score for whatever category
			double score = 0;
	   		System.out.println("There is no score for " + theNameOfStudent);
	   		System.out.println("What is the score? ");
			boolean placeholderForScore = false;
			while (placeholderForScore == false) {
				try {
				score = scanner.nextDouble();
				}
				catch(NumberFormatException f){
					System.out.println("Please input only numbers without a percent sign or special characters. ");
				}
				if (score > 100 || score < 0) {
					System.out.println("Please input scores between 0 and 100");
				}
				else {
					placeholderForScore = true;
				}
				}
			return score;
		}
		public static double TheFourthFile (String theNameOfStudent) throws FileNotFoundException {
			File theFinal = new File ("ImportFile4.txt");
			Scanner readFinal = new Scanner(theFinal);
			Scanner scanner = new Scanner (System.in);
			//Reading the file and finding out if the student has a score already 
			String str;
			double oldScore;
			String prison;
			while (readFinal.hasNextLine()) {
				prison = readFinal.nextLine();
				str = prison.replaceAll("[^\\d.]", "");
				str = str.trim();
		         if (str == theNameOfStudent) {
		            	 try {
		            		 oldScore = Double.parseDouble(prison);
		            		 return oldScore;
		            	 }
		            	 catch (NumberFormatException k){
		            		 System.out.println("There is no score for this");
		            		 break;
		            	 }
		         }
		    }
			//if Double.parseDouble(prison) doesn't have a value, the programs will ask the score for whatever category
			double score = 0;
	   		System.out.println("There is no score for " + theNameOfStudent);
	   		System.out.println("What is the score? ");
			boolean placeholderForScore = false;
			while (placeholderForScore == false) {
				try {
				score = scanner.nextDouble();
				}
				catch(NumberFormatException f){
					System.out.println("Please input only numbers without a percent sign or special characters. ");
				}
				if (score > 100 || score < 0) {
					System.out.println("Please input scores between 0 and 100");
				}
				else {
					placeholderForScore = true;
				}
				}
			return score;
		}
	}

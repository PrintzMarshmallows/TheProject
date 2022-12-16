import java.io.*;
import java.util.Scanner;
public class FinalProjectMain {
	public static void AddScore(String[] nameStudents) throws FileNotFoundException {
		String myVariableStudent;
		Scanner scnr = new Scanner (System.in);
		
		//The user will enter the name of the student and the program will find out if the student exists or not
		System.out.println("Which student is getting the added score? ");
		
		boolean placeholder = false;
	do {
			myVariableStudent = scnr.next();
			for (int i = 0; i < nameStudents.length; i++) {
				if (nameStudents[i] == myVariableStudent) {
					System.out.println("The student you selected is " + myVariableStudent + ". This student exists.");
					placeholder = true;
				}
				else {
					System.out.println("This student does not exist. Please input a student name:");
				}
			}
	}
	while (placeholder == false);
	
	//This will offer a choice for the user. The user will select the category they want to add a score for 
	System.out.println("Which category are you inputting this score? Input a number that corresponds with the desired category \n");
	System.out.println("1 - Homework \n2 - Quiz\n3 - Exam\n4 - Final");
	int userChoice = scnr.nextInt();
	boolean casePlaceholder = false;
	scnr.close();
	while (casePlaceholder == false) {
	switch (userChoice) {
	case 1:
		AddScoreHomework(myVariableStudent);
		casePlaceholder = true;
		break;
	case 2:
		AddScoreQuiz(myVariableStudent);
		casePlaceholder = true;
		break;
	case 3:
		AddScoreExam(myVariableStudent);
		casePlaceholder = true;
		break;
	case 4:
		AddScoreFinal(myVariableStudent);
		casePlaceholder = true;
		break;	
	default:
		System.out.println("This is an invalid input. Please input a number from the list\n\n1 - Homework \n2 - Quiz\n3 - Exam\n4 - Final");
		break;
	}
	}
	
	
	}
	
	public static void AddScoreHomework(String theNameOfStudent) throws FileNotFoundException {
		//creating constructors so so java can read the file and edit it
		File homework = new File ("ImportFile1.txt");
		PrintWriter printOutput = new PrintWriter(homework);
		Scanner readHomework = new Scanner(homework);
		Scanner scanner = new Scanner (System.in);
		StringBuffer buffer = new StringBuffer();
		String theplace = readHomework.nextLine();
		//Reading the file and finding out if the student has a score already 
		String str1 = null;
		double oldScore;
		while (readHomework.hasNextLine()) {
			 String functionPlacement = readHomework.nextLine();
	         buffer.append(functionPlacement + System.lineSeparator());
	         str1 = functionPlacement.replaceAll("[^\\d.]", "");
	         str1 = str1.trim();
	         if (str1 == theNameOfStudent) {
	        	 try {
	            	 oldScore = Double.parseDouble(functionPlacement);
	            	 System.out.println("The score already exists");
	            	 System.exit(0);
	        	 }
	        	 catch (NumberFormatException f) {
	        		 System.out.println("There is no score here");
	        		 break;
	        	 }
	         }
	    }
		
		//if Double.parseDouble(str) actually gets a value, then that means the score already existed meaning the person cannot add another one
		double score = 0;
		
		//if Double.parseDouble(str) doesn't have a value, the programs will ask the score for whatever category
   	 	
   		 System.out.println("There is no score for " + theNameOfStudent);
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			}
		//this is how I'm going to rewrite the file with the new added score. I hope this works
		String fileContents = buffer.toString();
		String StringToBeReplaced = str1;
		String theNewString = theNameOfStudent + "\t" + score;
		fileContents.replaceAll(StringToBeReplaced, theNewString);
		scanner.close();
	}
	public static void AddScoreQuiz(String theNameOfStudent) throws FileNotFoundException {
		//creating constructors so so java can read the file and edit it
		File quiz = new File ("ImportFile2.txt");
		PrintWriter printOutput = new PrintWriter(quiz);
		Scanner readQuiz = new Scanner(quiz);
		Scanner scanner = new Scanner (System.in);
		StringBuffer buffer = new StringBuffer();
		
		//Reading the file and finding out if the student has a score already 
		String str = null;
		double oldScore;
		while (readQuiz.hasNextLine()) {
			 String functionPlacement = readQuiz.nextLine();
	         buffer.append(functionPlacement + System.lineSeparator());
	         str = functionPlacement.replaceAll("[^\\d.]", "");
	         str = str.trim();
	         if (str == theNameOfStudent) {
	        	 try {
	            	 oldScore = Double.parseDouble(functionPlacement);
	            	 System.out.println("The score already exists");
	            	 System.exit(0);
	        	 }
	        	 catch (NumberFormatException f) {
	        		 System.out.println("There is no score here");
	        		 break;
	        	 }
	         }
	    }
	
		double score = 0;
		
		//if Double.parseDouble(str) actually gets a value, then that means the score already existed meaning the person cannot add another one
   		 
 
		
		//if Double.parseDouble(str) doesn't have a value, the programs will ask the score for whatever category
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			}
		//this is how I'm going to rewrite the file with the new added score. I hope this works
		String fileContents = buffer.toString();
		String StringToBeReplaced = str;
		String theNewString = theNameOfStudent + "\t" + score;
		fileContents.replaceAll(StringToBeReplaced, theNewString);
		scanner.close();
	}
	public static void AddScoreExam(String theNameOfStudent) throws FileNotFoundException{
		//creating constructors so so java can read the file and edit it
		File exam = new File ("ImportFile3.txt");
		PrintWriter printOutput = new PrintWriter(exam);
		Scanner readExam = new Scanner(exam);
		Scanner scanner = new Scanner (System.in);
		StringBuffer buffer = new StringBuffer();
		
		//Reading the file and finding out if the student has a score already
		String str = null;
		double oldScore;
		while (readExam.hasNextLine()) {
			 String functionPlacement = readExam.nextLine();
	         buffer.append(functionPlacement + System.lineSeparator());
	         str = functionPlacement.replaceAll("[^\\d.]", "");
	         str = str.trim();
	         if (str == theNameOfStudent) {
	        	 try {
	            	 oldScore = Double.parseDouble(functionPlacement);
	            	 System.out.println("The score already exists");
	            	 System.exit(0);
	        	 }
	        	 catch (NumberFormatException f) {
	        		 System.out.println("There is no score here");
	        		 break;
	        	 }
	         }
	    }
	
		//if Double.parseDouble(str) actually gets a value, then that means the score already existed meaning the person cannot add another one
		double score = 0;
		
		//if Double.parseDouble(str) doesn't have a value, the programs will ask the score for whatever category
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			}
		
		//this is how I'm going to rewrite the file with the new added score. I hope this works
		String fileContents = buffer.toString();
		String StringToBeReplaced = str;
		String theNewString = theNameOfStudent + "\t" + score;
		fileContents.replaceAll(StringToBeReplaced, theNewString);
		scanner.close();
	}
	public static void AddScoreFinal(String theNameOfStudent) throws FileNotFoundException{
		
		//creating constructors so so java can read the file and edit it
		File theFinal = new File ("ImportFile4.txt");
		PrintWriter printOutput = new PrintWriter(theFinal);
		Scanner readFinal = new Scanner(theFinal);
		Scanner scanner = new Scanner (System.in);
		StringBuffer buffer = new StringBuffer();
		
		//Reading the file and finding out if the student has a score already
		String str = null;
		double oldScore;
		while (readFinal.hasNextLine()) {
			 String functionPlacement = readFinal.nextLine();
	         buffer.append(functionPlacement + System.lineSeparator());
	         str = functionPlacement.replaceAll("[^\\d.]", "");
	         str = str.trim();
	         if (str == theNameOfStudent) {
	        	 try {
	            	 oldScore = Double.parseDouble(functionPlacement);
	            	 System.out.println("The score already exists");
	            	 System.exit(0);
	        	 }
	        	 catch (NumberFormatException f) {
	        		 System.out.println("There is no score here");
	        		 break;
	        	 }
	         }
	    }
	
		//if Double.parseDouble(str) actually gets a value, then that means the score already existed meaning the person cannot add another one
		double score = 0;
		
		//if Double.parseDouble(str) doesn't have a value, the programs will ask the score for whatever category
   	
   		System.out.println("What is the score? ");
		boolean placeholderForScore = false;
		while (placeholderForScore == false) {
			try {
			score = scanner.nextDouble();
			if (score > 100 || score < 0) {
				System.out.println("Please input scores between 0 and 100");
			}
			else {
				placeholderForScore = true;
			}
			}
			catch(NumberFormatException f){
				System.out.println("Please input only numbers without a percent sign or special characters. ");
			}
			}
		
		//this is how I'm going to rewrite the file with the new added score. I hope this works
		String fileContents = buffer.toString();
		String StringToBeReplaced = str;
		String theNewString = theNameOfStudent + "\t" + score;
		fileContents.replaceAll(StringToBeReplaced, theNewString);
		scanner.close();
	}
	public static void main (String[] args) throws FileNotFoundException{
		String[] students = {"Ari", "Dylan", "Marshmallows"};
		AddScore(String[] students);
	}
}

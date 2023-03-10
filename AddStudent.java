import java.io.*;
import java.util.*;
public class AddStudentClass {
	
	public static void AddStudent(String[] nameStudents) throws FileNotFoundException{
		Scanner scnr = new Scanner (System.in);
		
		String nameOfStudent = "";
		double score = 0.00;
		
		//gets the name of the student 
		System.out.println("What is the name of the student that you want to add? ");
		boolean placeholder = false;
		while (placeholder == false) {
		nameOfStudent = scnr.next();
		nameOfStudent = nameOfStudent.trim();
		if (!nameOfStudent.matches("^[A-Za-z]*$ ")) {
			placeholder = true;
		}
		else {
			System.out.println("This name input is invalid. Please input a name without numbers, spaces, or special characters");
		}
		}
		
		//checks if the student already exists
		for (int i = 0; i < nameStudents.length; i++) {
			if (nameStudents[i] == nameOfStudent) {
				System.out.println("This student already exists");
				System.exit(0);
			}
			else {
				System.out.println("The student's name has been added");
			}
		}
		
		//puts score into homework category
		System.out.println("What is the score in the homework category? Use only whole numbers and no percentages");
		boolean thePlaceholder = false;
		while (thePlaceholder == false) {
		try {
			score = scnr.nextDouble();
			thePlaceholder = true;
		}
		catch (NumberFormatException r){
			r.printStackTrace();
			System.out.println("Please numbers without percentages or special characters");
		}
		}
		try (FileWriter fw = new FileWriter("ImportFile1.txt", true); 
		BufferedWriter bw = new BufferedWriter(fw); 
		PrintWriter pw = new PrintWriter(bw);) {
            pw.print("\n" + nameOfStudent + "\t" + score + "%");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//puts score into quiz category
		boolean quizPlaceHolder = false;
		while (quizPlaceHolder == false) {
		System.out.println("What is the score in the quiz category? Use only whole numbers and no percentages");
		try {
			score = scnr.nextDouble();
			quizPlaceHolder = true;
		}
		catch (NumberFormatException r){
			r.printStackTrace();
			System.out.println("Please use only whole numbers without percentages or special characters");
		}
		}
		try (FileWriter quizWriter = new FileWriter("ImportFile2.txt", true); 
		BufferedWriter bufferedQuiz = new BufferedWriter(quizWriter); 
		PrintWriter printQuiz = new PrintWriter(bufferedQuiz);) {
            printQuiz.print("\n" + nameOfStudent + "\t" + score + "%");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//gets score for the exam category
		System.out.println("What is the score in the exam category? Use only whole numbers and no percentages");
		boolean examPlaceHolder = false;
		while(examPlaceHolder == false) {
		try {
			score = scnr.nextDouble();
			examPlaceHolder = true;
		}
		catch (NumberFormatException r){
			r.printStackTrace();
			System.out.println("Please use only whole numbers without percentages or special characters");
		}
		}
		//This is to add the student's scores in the exam file
		try (FileWriter examFile = new FileWriter("ImportFile3.txt", true); 
		BufferedWriter examBuffer = new BufferedWriter(examFile); 
		PrintWriter examPrint = new PrintWriter(examBuffer);) {
            examPrint.print("\n" + nameOfStudent + "\t" + score + "%");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		//gets score for final file
		System.out.println("What is the score in the final category? Use only whole numbers and no percentages");
		boolean finalPlaceHolder = false;
		while (finalPlaceHolder == false) {
		try {
			score = scnr.nextDouble();
		}
		catch (NumberFormatException r){
			r.printStackTrace();
			System.out.println("Please use only whole numbers without percentages or special characters");
		}
		}
		//puts score into final file
		try (FileWriter finalFile = new FileWriter("ImportFile4.txt", true); 
		BufferedWriter finalBuffer = new BufferedWriter(finalFile); 
		PrintWriter finalPrint = new PrintWriter(finalBuffer);) {
            finalPrint.print("\n" + nameOfStudent + "\t" + score + "%");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		scnr.close();
	}
	public static void main (String[] args) throws FileNotFoundException {
		String[] students = {"Ari", "Dylan", "Marshmallows"};
		AddStudent(students);
	}
}


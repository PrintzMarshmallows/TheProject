import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class TopRank {
	public static void RankNumberOne() throws IOException {
		
		RankOneHomework();
		RankOneQuiz();
		RankOneExam();
	}
	
	public static void RankOneHomework() throws IOException {
	File homework = new File ("ImportFile1.txt");
	Scanner readHomework = new Scanner(homework);	
	List<String> listOfStrings = new ArrayList<String>();
    Scanner scanner = new Scanner(new FileReader("ImportFile1.txt")).useDelimiter(",\\s*");
    String str;
    while (scanner.hasNextLine()) {
        str = scanner.nextLine();
        listOfStrings.add(str);
    }
    String[] studentsAndGrades = listOfStrings.toArray(new String[0]);
    double[] gradesHomework = null;
    double max = 0;
    for (int i = 0; i < studentsAndGrades.length; i++) {
    	try {
    		gradesHomework[i] = Double.parseDouble(studentsAndGrades[i]);
    	}
    	catch (NumberFormatException e) {
    		System.out.println("A student does not have a score for this category. They will not be factored into the rankings");    
    	}  
    	if(gradesHomework[i] > max) { 
            max = gradesHomework[i];
		}
    }
    String holder;
	String name;
	while (readHomework.hasNextLine()) {
		holder = readHomework.nextLine();
		if (Double.parseDouble(holder) == max) {
			name = holder.replaceAll("[^\\\\d.]", "");
    		name = name.trim();
			System.out.println("Top Ranked Student For Homework: " + name + "\t" + max);
		}
	}
	}
	
	public static void RankOneQuiz() throws FileNotFoundException{
		File homework = new File ("ImportFile2.txt");
		Scanner readQuiz = new Scanner(homework);	
		List<String> listOfStrings = new ArrayList<String>();
	    Scanner scanner = new Scanner(new FileReader("ImportFile2.txt")).useDelimiter(",\\s*");
	    String str;
	    while (scanner.hasNextLine()) {
	        str = scanner.nextLine();
	        listOfStrings.add(str);
	    }
	    String[] studentsAndGrades = listOfStrings.toArray(new String[0]);
	    double[] gradesHomework = null;
	    double max = 0;
	    for (int i = 0; i < studentsAndGrades.length; i++) {
	    	try {
	    		gradesHomework[i] = Double.parseDouble(studentsAndGrades[i]);
	    	}
	    	catch (NumberFormatException e) {
	    		System.out.println("A student does not have a score for this category. They will not be factored into the rankings");    
	    	}  
	    	if(gradesHomework[i] > max) { 
	            max = gradesHomework[i];
			}
	    }
	    String holder;
		String name;
		while (readQuiz.hasNextLine()) {
			holder = readQuiz.nextLine();
			if (Double.parseDouble(holder) == max) {
				name = holder.replaceAll("[^\\\\d.]", "");
	    		name = name.trim();
				System.out.println("Top Ranked Student For Quiz: " + name + "\t" + max);
			}
		}
	}
	public static void RankOneExam() throws FileNotFoundException {
		File homework = new File ("ImportFile3.txt");
		Scanner readQuiz = new Scanner(homework);	
		List<String> listOfStrings = new ArrayList<String>();
	    Scanner scanner = new Scanner(new FileReader("ImportFile3.txt")).useDelimiter(",\\s*");
	    String str;
	    while (scanner.hasNextLine()) {
	        str = scanner.nextLine();
	        listOfStrings.add(str);
	    }
	    String[] studentsAndGrades = listOfStrings.toArray(new String[0]);
	    double[] gradesHomework = null;
	    double max = 0;
	    for (int i = 0; i < studentsAndGrades.length; i++) {
	    	try {
	    		gradesHomework[i] = Double.parseDouble(studentsAndGrades[i]);
	    	}
	    	catch (NumberFormatException e) {
	    		System.out.println("A student does not have a score for this category. They will not be factored into the rankings");    
	    	}  
	    	if(gradesHomework[i] > max) { 
	            max = gradesHomework[i];
			}
	    }
	    String holder;
		String name;
		while (readQuiz.hasNextLine()) {
			holder = readQuiz.nextLine();
			if (Double.parseDouble(holder) == max) {
				name = holder.replaceAll("[^\\\\d.]", "");
	    		name = name.trim();
				System.out.println("Top Ranked Student For Exam: " + name + "\t" + max);
			}
		}
	}
	public static void RankOneFinal() throws FileNotFoundException {
		File homework = new File ("ImportFile4.txt");
		Scanner readQuiz = new Scanner(homework);	
		List<String> listOfStrings = new ArrayList<String>();
	    Scanner scanner = new Scanner(new FileReader("ImportFile4.txt")).useDelimiter(",\\s*");
	    String str;
	    while (scanner.hasNextLine()) {
	        str = scanner.nextLine();
	        listOfStrings.add(str);
	    }
	    String[] studentsAndGrades = listOfStrings.toArray(new String[0]);
	    double[] gradesHomework = null;
	    double max = 0;
	    for (int i = 0; i < studentsAndGrades.length; i++) {
	    	try {
	    		gradesHomework[i] = Double.parseDouble(studentsAndGrades[i]);
	    	}
	    	catch (NumberFormatException e) {
	    		System.out.println("A student does not have a score for this category. They will not be factored into the rankings");    
	    	}  
	    	if(gradesHomework[i] > max) { 
	            max = gradesHomework[i];
			}
	    }
	    String holder;
		String name;
		while (readQuiz.hasNextLine()) {
			holder = readQuiz.nextLine();
			if (Double.parseDouble(holder) == max) {
				name = holder.replaceAll("[^\\\\d.]", "");
	    		name = name.trim();
				System.out.println("Top Ranked Student For Final Exam: " + name + "\t" + max);
			}
		}
	}
	}

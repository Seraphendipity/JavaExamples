package student;
import java.util.ArrayList;

public class Student
{
	private static int counter;
	private  int id;

	private String fName;
	private String lName;
	private ArrayList<Integer> scores  = new ArrayList<>();
	private ArrayList<Double> weights = new ArrayList<>();
	// private double finalGrade; Do not stor what can be accessed dynamically
	// private String letterGrade; Same as above ^^
	public Student(String fName, String lName, ArrayList<Integer> scores)
	{
		
		// create your constructor
		this.fName = fName;
		this.lName = lName;
		this.scores = new ArrayList<>(scores);
		this.weights.add(0.25);
		this.weights.add(0.25);
		this.weights.add(0.5);
	}

	//Java has dreadful chain support
	// public Student(ArrayList<Integer> scores) {
	// 	this("Person","Lastname", scores);
	// 	fName = "Person-"+id;
	// 	lName = "LastName";
	// }

// Create the necessary methods to compute the letterGrade
	public double getFinalGrade() {
		
		double weight;
		int i = 0;
		double grade = 0;
		for(Integer score : this.scores) {
			weight = weights.get(i);
			grade += score.doubleValue()*weight;

			i++;
		}
		i=0;
		return grade;
	}

	public char getLetterGrade() {
		double nGrade = this.getFinalGrade();
		char lGrade;
		if(nGrade > 90) {
			lGrade = 'A';
		} else if(nGrade > 80) {
			lGrade = 'B';
		} else if(nGrade > 70) {
			lGrade = 'C';
		//} else if(nGrade > 60) {
		//	lGrade = 'D';
		} else {
			lGrade = 'F';
		}
		return lGrade;
	}

	public String toString() {
		return fName + " " + lName + ": " + this.getFinalGrade() + " -> " + this.getLetterGrade();
	}

}

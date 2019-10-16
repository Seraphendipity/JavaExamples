// package student.src.main.java.student;

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Student
// {
// 	private String Name;
// 	private String lastName;
// 	private int exam1,exam2, finalExam;
// 	private double finalGrade;
// 	private String letterGrade;
	
// 	public Student(String Name, String lastName, int exam1, int exam2, int finalExam){
		
// 		this.Name = Name;
// 		this.lastName = lastName;
// 		this.exam1 = exam1;
// 		this.exam2 = exam2;
// 		this.finalExam = finalExam;
		
// 	}
	
// 	public Student(String fName, String lName, ArrayList<Integer> scores) {
// 	}

// 	public void setFinalGrade() {
		
// 		this.finalGrade = (this.exam1 * 0.25) + (this.exam2 * 0.25) + (this.finalExam * 0.5);
// 	}
	
// 	public double getFinalGrade() {
		
// 		return this.finalGrade;
// 	}
	
// 	public void setLetterGrade() {
		
// 		double temp = this.finalGrade;
		
// 		if (temp >= 90) {
// 			this.letterGrade = "A";
// 		}
		
// 		if (temp < 90 && temp >=80) {
// 			this.letterGrade = "B";
// 		}
		
// 		if (temp < 80 && temp >=70 ) {
// 			this.letterGrade = "C";
// 		}
		
// 		if (temp < 70) {
			
// 			this.letterGrade = "F";
// 		}
// 	}
	
// 	public String getLetterGrade() {
		
// 		return this.letterGrade;
// 	}
	
// 	public String getName() {
		
// 		return this.Name;
// 	}
	
// 	public static void main(String[] args) {
		
// 		Student[] students = new Student[5];
		
// 		Student s1 = new Student("Guy", "Fieri", 40,60,90);
// 		Student s2 = new Student("Cool", "McCool", 50,78,40);
// 		Student s3 = new Student("Tom", "Brady", 0,15,16);
// 		Student s4 = new Student("Russell", "Westbrook", 7,99,90);
// 		Student s5 = new Student("Guy2", "Fieri2", 40,35,90);
		
// 		students[0] =s1;
// 		students[1] =s2;
// 		students[2] =s3;
// 		students[3] =s4;
// 		students[4] =s5;
		
// //		System.out.print(Arrays.toString(students));
		
// 		for (int i = 0; i < students.length; i++) {
			
// 			System.out.println("Name: " + students[i].getName());
// 			students[i].setFinalGrade();
// 			students[i].setLetterGrade();
// 			System.out.println("Letter Grade: " + students[i].getLetterGrade());
// 		}
// 	}



// }

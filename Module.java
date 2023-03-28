import java.util.*;

public class Module {
	public String Cname;
	public String Ename;
	public int semeter;
	public double credit;
	public int score;
	public String teacherName;
	public String skills;
	public String products;

	public Module(String Cname, String Ename, int semeter, double credit, int score, String teacherName, String skills,
			String products) {
		this.Cname = Cname;
		this.Ename = Ename;
		this.semeter = semeter;
		this.credit = credit;
		this.score = score;
		this.teacherName = teacherName;
		this.skills = skills;
		this.products = products;
	}

	ArrayList<Module> module = new ArrayList<Module>();

	public double calGPA() {
		double GPA = 0.0;
		double eachGPA = 0.0;
		int sumOfCredit = 0;
		double averageGPA = 0.0;
		for (int i = 0; i < module.size(); i++) {
			if (module.get(i).score >= 60 || module.get(i).score <= 100) {
				eachGPA = 4 - 3 * (100 - module.get(i).score) ^ 2 / 1600;
			}
			sumOfCredit += module.get(i).credit;
			averageGPA = eachGPA * module.get(i).credit;
		}
		GPA = averageGPA / sumOfCredit;
		return GPA;
	}

	/*
	 * public void getAverage() {
	 * for (int i = 0; i <length; i++) {
	 * sumOfScore += score[i] * credit[i];
	 * sumOfCredit += credit[i];
	 * }
	 * average = sumOfScore / sumOfCredit;
	 * }
	 */
}

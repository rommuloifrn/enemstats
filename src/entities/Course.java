package entities;

public class Course {
	
	private String name;
	private double languagesWeight;
	private double mathWeight;
	private double humanitiesWeight;
	private double natureWeight;
	private double essayWeight;
	
	private double year;
	private double passingScore;
	private double pasingScorePPP;
	
	public Course() {
	}
	
	public Course(String name, double languagesWeight, double mathWeight, double humanitiesWeight, double natureWeight, double essayWeight, double year, double passingScore, double passingScorePPP) {
		this.name = name;
		this.languagesWeight = languagesWeight;
		this.mathWeight = mathWeight;
		this.humanitiesWeight = humanitiesWeight;
		this.natureWeight = natureWeight;
		this.essayWeight = essayWeight;

		this.year = year;
		this.passingScore = passingScore;
		this.pasingScorePPP = passingScorePPP;
	}
	
	public Course(String name, double languagesWeight, double mathWeight, double humanitiesWeight, double natureWeight, double essayWeight) {
		this.name = name;
		this.languagesWeight = languagesWeight;
		this.mathWeight = mathWeight;
		this.humanitiesWeight = humanitiesWeight;
		this.natureWeight = natureWeight;
		this.essayWeight = essayWeight;
	}
	
	public double gradeOnIt(Exam exam) {
		double weightSum = languagesWeight + mathWeight + humanitiesWeight + natureWeight + essayWeight;
		double gradeSum = exam.getLanguagesGrade()*languagesWeight + exam.getMathGrade()*mathWeight + exam.getHumanitiesGrade()*humanitiesWeight + exam.getNatureGrade()*natureWeight + exam.getEssayGrade()*essayWeight;
		double result = gradeSum / weightSum;
		
		return result;
	}
	
	public String toString() {
		return String.format("%s - %.1f", name, year);
	}

	public String getName() {
		return name;
	}

	public double getLanguagesWeight() {
		return languagesWeight;
	}

	public double getMathWeight() {
		return mathWeight;
	}

	public double getHumanitiesWeight() {
		return humanitiesWeight;
	}

	public double getNatureWeight() {
		return natureWeight;
	}

	public double getEssayWeight() {
		return essayWeight;
	}

	public double getYear() {
		return year;
	}

	public double getPassingScore() {
		return passingScore;
	}

	public double getPasingScorePPP() {
		return pasingScorePPP;
	}
}

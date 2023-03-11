package entities;

public class Exam {
	
	private String name;
	private double languagesGrade;
	private double mathGrade;
	private double humanitiesGrade;
	private double natureGrade;
	private double essayGrade;
	
	public Exam() {
	}
	
	public Exam(String name, double languagesGrade, double mathGrade, double humanitiesGrade, double natureGrade, double essayGrade) {
		super();
		this.name = name;
		this.languagesGrade = languagesGrade;
		this.mathGrade = mathGrade;
		this.humanitiesGrade = humanitiesGrade;
		this.natureGrade = natureGrade;
		this.essayGrade = essayGrade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getLanguagesGrade() {
		return languagesGrade;
	}
	public double getMathGrade() {
		return mathGrade;
	}
	public double getHumanitiesGrade() {
		return humanitiesGrade;
	}
	public double getNatureGrade() {
		return natureGrade;
	}
	public double getEssayGrade() {
		return essayGrade;
	}
	public void setLanguagesGrade(double languagesGrade) {
		this.languagesGrade = languagesGrade;
	}
	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	public void setHumanitiesGrade(double humanitiesGrade) {
		this.humanitiesGrade = humanitiesGrade;
	}
	public void setNatureGrade(double natureGrade) {
		this.natureGrade = natureGrade;
	}
	public void setEssayGrade(double essayGrade) {
		this.essayGrade = essayGrade;
	}
}
	

package main_package;

public class Calculation {
	public static double calcQbRating(double att, double comp, double yds, double td, double int_field){
		double a = (((comp/att)-.3)*5);
		double b = (((yds/att)-3)*.25);
		double c = ((td/att) *20);
		double d=(2.375-((int_field/att)*25));
		
		double qbRating = ((a + b + c + d)/6)*100;
		return qbRating;
		
	}

}

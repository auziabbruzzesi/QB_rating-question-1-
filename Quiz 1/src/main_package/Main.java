package main_package;

public class Main {
	private static double att = Query.askForData("Please enter the # of passing attempts:");//example is 532
	private static double comp = Query.askForData("Please enter the # of completions:");//example is 346
	private static double yds = Query.askForData("Please enter passing yards:");//example is 3725
	private static double td = Query.askForData("Please enter # of touchdown passes:");//example is 19
	private static double int_field= Query.askForData("Please enter # of interceptions:");//example is 14
	private static double qbRating = Calculation.calcQbRating(att, comp, yds, td, int_field);//example output:86.39...
	
	public static void main(String[] args){
		System.out.println("QB RATING:");
		System.out.print(qbRating);
		Query.user_input.close();
	}

}

package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		
		try {
			today = new Date(1,1,2017);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}

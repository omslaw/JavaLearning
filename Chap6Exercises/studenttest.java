/**
 * 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class studenttest extends ConsoleProgram {
	
	public void run() {
		Student topStudent = new Student("George Oms", 69);
		println(topStudent);
		String name = topStudent.getName();
		double credits = topStudent.getCredits();
		println(name + " and his credits " + credits);
		
		topStudent.setCredits(31);
		
		if (topStudent.isPaidUp()) {
			println("fool be paid up cuz");
		} else {
			println("somebody betta make a payment");
		}
		credits = topStudent.getCredits();
		println(name + " and his credits " + credits);
		topStudent.setCredits(33);
		println("remaining credits " + topStudent.remainingCredits());
		println("credits needed " + Student.CREDITS_TO_GRADUATE);
		
		Rational a = new Rational(1, 2);
		Rational b = new Rational(1, 3);
		Rational c = new Rational(1, 6);
		Rational sum = a.add(b).add(c);
		println();
		println(a + " + " + b + " + " + c + " = " + sum);
		println("to verify private string can't be accessed. " + Student.testP);
		
		
		
	}

}

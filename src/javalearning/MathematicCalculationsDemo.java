package javalearning;

public class MathematicCalculationsDemo {
	public static void main(String args[]) {
		MathematicCalculation mc = new MathematicCalculation();
		System.out.println(mc.Sum(10, 20));
		MathematicCalculation1 mc1 = new MathematicCalculation1();
		System.out.println(mc1.Sum(10, 20));
		MathematicCalculation2 mc2 = new MathematicCalculation2();
		System.out.println(mc2.Sum(10, 20));
		useInterface UI = new useInterface();
		System.out.println(UI.carModel("TATA"));
		System.out.println(UI.carSpeed(100));
	}

}

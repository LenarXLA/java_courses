public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");

		//Integer
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double sum = first + second;
		double negat = first - second;
		double multi = first * second;
		double divis = first / second;
		double exp = (double) Math.pow(first, second);
		System.out.println("Sum: " + sum);
		System.out.println("Negat: " + negat);
		System.out.println("Multi: " + multi);
		System.out.println("Divis: " + divis);
		System.out.println("Exp: " + exp);
	}

}
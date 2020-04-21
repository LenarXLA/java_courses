
public class ArgRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);

        calc.add(first, second);
        System.out.println("Sum = " + calc.getResult());

        calc.subtrac(first, second);
        System.out.println("Subtr = " + calc.getResult());

        calc.multip(first, second);
        System.out.println("Multipl = " + calc.getResult());

        calc.divis(first, second);
        System.out.println("Divis = " + calc.getResult());
    }
}
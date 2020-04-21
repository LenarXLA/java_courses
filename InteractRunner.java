import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String query = "";
            while(query != "7") {
                System.out.println("Выберите пункт меню: \n" +
                                "1) Сложить \n" +
                                "2) Вычесть \n" +
                                "3) Умножить \n" +
                                "4) Делить \n" +
                                "5) Произвести вычисление с полученным результатом \n" +
                                "6) Очистить \n" +
                                "7) Выйти из калькулятора"
                                );
                query = reader.next();
                switch (query) {
                    case "1":
                            calc.cleanResult();
                            System.out.println("Enter first arg: ");
                            String first = reader.next();
                            System.out.println("Enter second arg: ");
                            String second = reader.next();
                            calc.add(Integer.valueOf(first), Integer.valueOf(second));
                            System.out.println("Result: " + calc.getResult());
                            
                        break;
                    
                    case "2":
                            calc.cleanResult();
                            System.out.println("Enter first arg: ");
                            String first2 = reader.next();
                            System.out.println("Enter second arg: ");
                            String second2 = reader.next();
                            calc.subtrac(Integer.valueOf(first2), Integer.valueOf(second2));
                            System.out.println("Result: " + calc.getResult());
                        break;

                    case "3":
                            calc.cleanResult();
                            System.out.println("Enter first arg: ");
                            String first3 = reader.next();
                            System.out.println("Enter second arg: ");
                            String second3 = reader.next();
                            calc.multip(Integer.valueOf(first3), Integer.valueOf(second3));
                            System.out.println("Result: " + calc.getResult());
                        break;

                    case "4":
                            calc.cleanResult();
                            System.out.println("Enter first arg: ");
                            String first4 = reader.next();
                            System.out.println("Enter second arg: ");
                            String second4 = reader.next();
                            calc.divis(Integer.valueOf(first4), Integer.valueOf(second4));
                            System.out.println("Result: " + calc.getResult());
                        break;
                    
                    case "5":
                            int first5 = calc.getResult();
                            System.out.println("Enter second arg: ");
                            String second5 = reader.next();
                            System.out.println("Enter operator: ");
                            String operator = reader.next();
                            if (operator.equals("+")) {
                                calc.add(Integer.valueOf(first5), Integer.valueOf(second5));
                            } else if (operator.equals("-")) {
                                calc.subtrac(Integer.valueOf(first5), Integer.valueOf(second5));
                            } else if (operator.equals("*")) {
                                calc.multip(Integer.valueOf(first5), Integer.valueOf(second5));
                            } else if (operator.equals("-")) {
                                calc.divis(Integer.valueOf(first5), Integer.valueOf(second5));
                            } else {
                                System.out.println("Неправильный ввод оператора, повторите пожалуйста");
                                reader.next();
                            }
                            System.out.println("Result: " + calc.getResult());
                        break;

                    case "6":
                            calc.cleanResult();
                        break;

                    case "7":
                            query = "7";
                        break;
                
                    default:
                            System.out.println("Неправильный ввод, повторите пожалуйста");
                        break;
                }
            }
        } finally {
            reader.close();
        }
    }
}
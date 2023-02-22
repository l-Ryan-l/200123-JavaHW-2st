import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4_CalculatorLogging {
    public static void main(String[] args) {
        Logger iLogger = Logger.getLogger(Task4_CalculatorLogging.class.getName());
        Scanner iScanner = new Scanner(System.in);
        String operation = "+";
        while (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {

            System.out.println("Введите операцию: ");
            operation = iScanner.next();
            iLogger.log(Level.INFO, "User inserted " + operation);
            System.out.println("Введите 1-ое число: ");
            float a = iScanner.nextFloat();
            iLogger.log(Level.INFO, "The first digit is " + a);
            System.out.println("Введите 2-ое число: ");
            float b = iScanner.nextFloat();
            iLogger.log(Level.INFO, "The second digit is " + b);

            switch (operation) {
                case "+" -> {
                    float res = a + b;
                    System.out.println(a + " + " + b + " = " + res);
                    iLogger.log(Level.INFO, "Result is " + res);
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "-" -> {
                    float res = a - b;
                    System.out.println(a + " - " + b + " = " + res);
                    iLogger.log(Level.INFO, "Result is " + res);
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "*" -> {
                    float res = a * b;
                    System.out.println(a + " * " + b + " = " + res);
                    iLogger.log(Level.INFO, "Result is " + res);
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "/" -> {
                    float res = a / b;
                    System.out.println(a + " / " + b + " = " + res);
                    iLogger.log(Level.INFO, "Result is " + res);
                    System.out.println("Чтобы выйти из калькулятора, вместо операции напишите 'stop'.\n");
                }
                case "stop" -> {
                    String res = "Stop";
                    System.out.println("Приходите еще!");
                    iLogger.log(Level.INFO, "Work has been stopped");
                }
                default -> System.out.println("Введите корректный знак");
            }

        }
        iScanner.close();
    }
}


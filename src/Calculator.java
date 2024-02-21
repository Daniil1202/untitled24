public class Calculator {
    public static <T extends Number> int sum(T num1, T num2) {
        return num1.intValue() + num2.intValue();
    }
    public static <T extends Number> int subtract(T num1, T num2) {
        return num1.intValue() - num2.intValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.intValue() * num2.intValue();
    }

    public static <T extends Number > double divide(T num1, T num2) {
        if (num2.doubleValue() == 0){
            throw new ArithmeticException("На 0 делить нельзя");
        }
            return (double) num1.intValue() /num2.intValue();

        }

    public static void main(String[] args) {
        int a = sum(10,5);
        int a1 = subtract(23,5);
        double a2 = multiply(5,6);
        double a3 =  divide(10,2);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    }


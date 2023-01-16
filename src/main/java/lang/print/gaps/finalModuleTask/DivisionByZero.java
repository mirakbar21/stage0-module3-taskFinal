package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args) {
//        float number = 10f;
//        System.out.println(number/0);
        int number = 4123;
        System.out.println((number / 1000) + (number % 1000 / 100) + (number % 1000 % 10) + (number % 1000 % 100 % 10));
//        System.out.println(number % 1000 % 10);
        System.out.println(number / 1000);
        System.out.println(number % 1000 / 100);
        System.out.println(number % 1000 % 100 % 10);
        System.out.println(number % 1000 % 100 / 10);
    }
}


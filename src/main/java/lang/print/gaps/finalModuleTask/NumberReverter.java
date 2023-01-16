package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        //489
        System.out.println(number % 100 % 10 + "" + number % 100 / 10 + "" + number / 100);
    }
}

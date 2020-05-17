public class Operator {

    public static void main(String[] args) {

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double result = (myFirstDouble + mySecondDouble) * 100.00d;
        double remainder = result % 40.00d;

        boolean isZero = (remainder == 0) ? true : false;

        System.out.println(isZero);

        if(!isZero) {
            System.out.println("Got some remainder");
        }


    }
}

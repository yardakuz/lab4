import functions.*;
import functions.basic.Cos;
import functions.basic.Sin;

public class Main {
    public static void main(String[] args) {
        Function sin = new Sin();
        Function cos = new Cos();

        for (double i = 0; i <= 2 * Math.PI; i += 0.1) {
            System.out.println("sin = " + sin.getFunctionValue(i) + " cos = " + cos.getFunctionValue(i));
        }
        System.out.println();


        TabulatedFunction tabulatedSin = TabulatedFunctions.tabulate(sin, 0, 2 * Math.PI, 10);
        TabulatedFunction tabulatedCos = TabulatedFunctions.tabulate(cos, 0, 2 * Math.PI, 10);

        for (double i = 0; i <= 2 * Math.PI; i += 0.1) {
            System.out.println("TabSin = " + tabulatedSin.getFunctionValue(i) + " TabCos = " + tabulatedCos.getFunctionValue(i));
        }
        System.out.println();






    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salarioInicial;
        double salarioFinal = 0;
        double aumento = 0;
        double inflacao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba seu salario:");
        salarioInicial = scanner.nextInt();


        int[] limites = {280, 700, 1500, Integer.MAX_VALUE};
        double[] porcentajes = {0.2, 0.15, 0.1, 0.05};
        for (int i = 0; i < limites.length; i++) {
            if (salarioInicial <= limites[i]) {
                aumento = salarioInicial * porcentajes[i];
                salarioFinal = salarioInicial + aumento;
                break;
            }
        }


        inflacao = salarioFinal * 0.038;
        double salarioDesconto = salarioFinal - inflacao;


        System.out.println("Salario inicial: " + salarioInicial);
        System.out.println("Salario con o aumento: " + salarioFinal);
        System.out.println("Salario final con descuento do 3.8%: " + salarioDesconto);
    }
}

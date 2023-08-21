import java.util.Scanner;

public class ParametrosInvalidosException extends Exception {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        while (parametroUm < parametroDois) {

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
        }

    }
}
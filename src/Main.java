import service.CalculadoraService;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculadoraService service = new CalculadoraService();

        while (true) {
        System.out.println("--- Calculadora Java ---");

        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite a Operação :Soma,Subtraçao,Divisao e Multiplicacao ");

        String sinal = leitor.next();

        System.out.print("Digite o Segundo número: ");
        double n2 = leitor.nextDouble();

            double resultado = service.realizarCalculo(n1, n2, sinal);
            System.out.println("Resultado" + resultado);
            System.out.println("Deseja fazer outro Cálculo (S/N):");
            String resp = leitor.next();
            if (resp.equalsIgnoreCase("n")) ;{
                System.out.println("Até logo!");
                break;
            }
        }
    }
}





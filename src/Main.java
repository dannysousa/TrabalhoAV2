
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (true) {

            System.out.println("\n Entre com umas das op��es abaixo\n"
                    + "1 - Corte de haste / implementa��o recursiva de cima para baixo\n"
                    + "2 - Corte de haste / implementa��o din�mica de cima para baixo com memoiza��o\n"
                    + "3 - Corte de haste / implementa��o din�mica de baixo para cima\n"
                    + "4 - Sele��o de atividades / algoritmo guloso iterativo\n"
                    + "5 - Encerrar Programa");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    RecursivaUpDown.executar();
                    break;
                case 2:
                    DinamicaUpDownMemo.executar();
                    break;
                case 3:
                    DinamicaDownUp.executar();
                    break;
                case 4:
                    GulosoInterativo.executar();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Este n�o � uma op��o valida!");
            }
        }

    }

}
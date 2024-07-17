import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //calculadora basica = Adição - Multiplicação - Subtração - divisão
        //texto explicando como utilizar a calculadora
        System.out.println("Digite 1 para Adição");
        System.out.println("Digite 2 para Subtração");
        System.out.println("Digite 3 para Multiplicação");
        System.out.println("Digite 4 para Divisão");
        Scanner objetoConta = new Scanner(System.in);
        System.out.println("Digite o numero que voce irá usar");
        int NumeroAcao = objetoConta.nextInt();

        switch (NumeroAcao){
            case 1: //Adição
                int numero, numero2;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da soma"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da soma"));
                int soma;
                soma = (numero + numero2);
                System.out.println("O valor da soma é: " + soma);
        break;
            case 2://Subtração
            int numeroSub, numeroSub2;
            numeroSub = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da sub"));
            numeroSub2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da sub"));
            int sub;
            sub = (numeroSub - numeroSub2);
            System.out.println("O valor da Subtração é: " + sub);
                break;

            case 3://Multiplicação//s
                int numeroMult1, numeroMult2;
                numeroMult1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da Multiplicação"));
                numeroMult2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da Multiplicação"));
                int Multi;
                Multi = (numeroMult1 * numeroMult2);
                System.out.println("O valor da Multiplicação é: " + Multi);
                break;

            case 4://divisão
                int numeroDiv, numeroDiv2;
                numeroDiv = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero da divisão"));
                numeroDiv2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero da divisão"));
                int div;
                div = (numeroDiv / numeroDiv2);
                System.out.println("O valor da Divisão é: " + div);
                break;
            default:
                System.out.println("nada");
        }
    }
}
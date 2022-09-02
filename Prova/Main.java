package Prova;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        Calaculadora c = new Calaculadora();

        boolean t = true;

        while(t == true){

            System.out.println("\nDigite um número: ");
            double n1 = e.nextDouble();
            System.out.println("Digite um operador: ");
            String o = e.next(); //operador
            System.out.println("Digite outro número:");           
            double n2 = e.nextDouble();
            
            switch (o) {
                case "+":
                    c.somar(n1, n2);
                    break;
                case "-":
                    c.subtrair(n1, n2);
                    break;
                case "*":
                    c.multiplicar(n1, n2);
                    break;
                case "/":
                    c.dividir(n1, n2);
                    break;
                case "%":
                    c.mod(n1, n2);
                    break;
            }
        }
    }
}

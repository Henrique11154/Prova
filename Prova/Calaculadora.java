package Prova;
public class Calaculadora{

    public static void somar(double n1, double n2){

        double s = n1+n2;
        System.out.println(s);
    }
    public static void subtrair(double n1, double n2){

        double R = n1-n2;//Reduzir
        System.out.println(R);
    }
    public static void multiplicar( double n1, double n2){
        double M = n1*n2; // Multiplicar
        System.out.println(M); 
    }
    public static void dividir( double n1, double n2){

        if (n2 == 0){
            System.out.println("[ERROR]Divisão por Zero não existe.");
            
        }else{
            double D = n1/n2; //Dividir
            System.out.println(D);
        }

    }
    public static void mod (double n1, double n2){
        double MD = n1%n2; // MD = Mod 
        System.out.println(MD);
    }

}

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
    
    Scanner e = new Scanner(System.in);
    boolean t = true;

    System.out.println("Digite o tipo de conta: ");
    String tipoDeConta = e.next();
    while(t == false){
        if (tipoDeConta == "Poupança" || tipoDeConta == "poupança" ||tipoDeConta == "poupanca"){
            System.out.println("Digite o número da conta");
            int numConta = e.nextInt();
            System.out.println("Digite o nome do cliente: ");
            String Cliente = e.nextLine();
            System.out.println("Digite o seu saldo:");
            float saldo = e.nextFloat();
            ContaPoupanca ce = new ContaPoupanca(Cliente, numConta, saldo);
            System.out.println("1-Deseja Sacar?");
            System.out.println("2-Deseja Depositar?");
            System.out.println("3-[Ver conta]:");
            int o = e.nextInt();
            switch(o){
                case 1: 
                    System.out.println("Quanto você deseja sacar: ");
                    Float dinheiroSacado = e.nextFloat();
                    ce.sacar(dinheiroSacado);
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar: ");
                    float deposito = e.nextFloat();
                    ce.depositar(deposito);
                    break;
                case 3:
                    System.out.println(ce.getCliente() + ce.getNumConta() + ce.getSaldo());
                    break;
            }

        }else{
            System.out.println("Digite o número da conta");
            int numConta = e.nextInt();
            System.out.println("Digite o nome do cliente: ");
            String Cliente = e.nextLine();
            System.out.println("Digite o seu saldo:");
            float saldo = e.nextFloat();
            ContaEspecial ce = new ContaEspecial(Cliente, numConta, saldo);
            System.out.println("1-Deseja Sacar?");
            System.out.println("2-Deseja Depositar?");
            System.out.println("3-[Ver conta]:");
            int o = e.nextInt();
            switch(o){
                case 1: 
                    System.out.println("Quanto você deseja sacar: ");
                    Float dinheiroSacado = e.nextFloat();
                    ce.sacar(dinheiroSacado);
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar: ");
                    float deposito = e.nextFloat();
                    ce.depositar(deposito);
                    break;
                case 3:
                    System.out.println(ce.getCliente() + ce.getNumConta() + ce.getSaldo());
                    break;
                }
            }
        }
    }
}

public class ContaEspecial extends ContaBancaria{

    double LimiteDeSaque = -100;
    public ContaEspecial(String Cliente, int numConta, float saldo) {
        super(Cliente, numConta, saldo);
    }

    public float sacar(float dinheiroSacado){
        
        if(LimiteDeSaque < dinheiroSacado){
            System.out.println("Não é possivel sacar este valor");
            return 0;
        }else{
            float t = saldo - dinheiroSacado;
            return t;
        }
    }

}
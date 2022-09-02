public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento = 5;
    public ContaPoupanca(String Cliente, int numConta, float saldo) {
        super(Cliente, numConta, saldo);
    }

    public void CacularNovoSaldo(int diaDeRendimento){
        float rend = saldo + 5/100;
    }

    
    
}
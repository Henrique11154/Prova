public class ContaBancaria {
    protected String Cliente;
    protected int numConta;
    protected float saldo;
 
    public ContaBancaria(String Cliente, int numConta, float saldo){
        this.Cliente = Cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public float sacar(float dinheiroSacado) {
        float t = saldo - dinheiroSacado;
        if (t < 0){
            System.out.println("Você não pode sacar esse valor.");
            return 0;
        }else{
            return t;
        }
    }

    public float depositar(float deposito){
        float t = saldo + deposito;
        return t;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



}

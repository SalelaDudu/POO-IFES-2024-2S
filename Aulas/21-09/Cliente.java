abstract class Cliente{

    private int numeroConta;
    private String agencia;
    private float saldo;
    private float limite;

    // Construtor + setter/getter
    public Cliente(int numeroConta, String agencia, float limite){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.limite = limite;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    // Métodos
    public float sacar(float valor){
        setSaldo(getSaldo() - valor);
        return valor;
    }
    public void depositar(float valor){
        setSaldo(getSaldo() + valor);
    }

    public boolean transferir(Cliente cliente,float valor){
            if((getSaldo() - valor) < 0){
                return false;
            }
            else{
                setSaldo((getSaldo() - valor));
                cliente.setSaldo(cliente.getSaldo() + valor);
                return true;
            }        
    }
    abstract public void imprimirExtrato();
}
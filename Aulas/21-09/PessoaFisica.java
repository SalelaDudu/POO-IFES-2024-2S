class PessoaFisica extends Cliente {
    private int cpf;
    private String nome;
    
    // Constructor e set/get

    public PessoaFisica(int numeroConta, String agencia, float limite, int cpf, String nome){
        super(numeroConta,agencia, limite);
        this.cpf = cpf;
        this.nome = nome;
        this.setLimite(1000f);
    }
    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void imprimirExtrato(){
        System.out.println("Nome " + getNome() + "\nCpf: " + getCpf() + "\nAgência: " + getAgencia() + "\n Numer da conta: " + getNumeroConta());
    }
}

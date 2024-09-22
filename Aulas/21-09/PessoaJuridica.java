class PessoaJuridica  extends Cliente{
    private int cnpj;
    private String razaoSocial;
    private String naturezaJuridica;
    
    //

    public PessoaJuridica(int numeroConta, String agencia, float limite, int cnpj, String razaoSocial, String naturezaJuridica){
        super(numeroConta,agencia, limite);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.naturezaJuridica = naturezaJuridica;
        this.setLimite(5000f);
    }

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNaturezaJuridica() {
        return this.naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public void imprimirExtrato(){
            System.out.println("Razão social: " + getRazaoSocial() + "\nCnpj: " + getCnpj() + "\nAgência: " + getAgencia() + "\nNatureza Jurídica: " + getNaturezaJuridica());
    }
}

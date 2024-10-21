class Terceirizado extends Funcionario {
    private String empresaContratada;

    public Terceirizado(String nome,int idade, double salario, String dataContratacao,String empresaContratada){
        super(nome,idade,salario,dataContratacao);
        this.empresaContratada = empresaContratada;
    }

    public Terceirizado(){
        super();
        this. empresaContratada = "E-Coorp";
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }
    public String getEmpresaContratada() {
        return empresaContratada;
    }

    @Override
    public double calcularBonus() {
        
        return (super.getSalario() * 0.05);
    }
}

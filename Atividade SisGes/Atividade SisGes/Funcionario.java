import java.util.*;
import java.text.*;

class Funcionario extends Pessoa{
    private double salario;
    private String dataContratacao;

    public Funcionario(){
        super();
        this.salario = 1900f;
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.dataContratacao = formatter.format(new Date());
    }
    
    public Funcionario(String nome, int idade, double salario, String dataContatacao){
        super(nome,idade);
        this.salario = salario;
        this.dataContratacao = dataContatacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public String getDataContratacao() {
        return dataContratacao;
    }
    public double getSalario() {
        return salario;
    }

    public double calcularBonus(){
        return ((getSalario() * 0.1));
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Contratacao = " + getDataContratacao());
        System.out.println("Salario = " + getSalario());
        System.out.println();
    }

}
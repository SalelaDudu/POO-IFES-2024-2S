public class Main {

    public static void main(String[] args){
        Funcionario f1 = new Funcionario("João",33,5329.82,"17/10/2021");
        Funcionario f2 = new Funcionario();

        Terceirizado t1 = new Terceirizado("Pedro",23,2137.48,"21/08/2024","Soft-Tec");
        Terceirizado t2 = new Terceirizado();

        Equipe e = new Equipe("Time de Desenvolvimento", f1);

        e.adicionarMembro(f1);
        e.adicionarMembro(f2);
        e.adicionarMembro(t1);
        e.adicionarMembro(t2);

        e.exibirMembros();

        for (Funcionario f : e.funcionarios) {            
            System.out.println("O bonus de " + f.getNome() + " e de: " + f.calcularBonus());
            System.out.println();
        }
    }
    
}
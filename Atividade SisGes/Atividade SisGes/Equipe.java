import java.util.ArrayList;
import java.util.List;

class Equipe {
   private String nomeEquipe;
   private Funcionario lider;
   List<Funcionario> funcionarios = new ArrayList<Funcionario>();

   public Equipe(String nomeEquipe, Funcionario lider){
    this.nomeEquipe = nomeEquipe;
    this.lider = lider;    
   }

    public void setLider(Funcionario lider) {
        this.lider = lider;
    }
    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Funcionario getLider() {
        return lider;
    }
    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void adicionarMembro(Funcionario membro){
        funcionarios.add(membro);
    }

    public void removerMembro(Funcionario membro){
        funcionarios.remove(membro);
    }

    public void exibirMembros(){
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}

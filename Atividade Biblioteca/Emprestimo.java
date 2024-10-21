import java.util.logging.ErrorManager;

class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public Livro getLivro() {
        return livro;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void exibirDados(){
        usuario.exibirDados();
        livro.exibirDados();
    }
}

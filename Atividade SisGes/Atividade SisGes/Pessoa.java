class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "Fulano";
        this.idade = 18;
    }

    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados(){
        System.out.println("Nome = " + getNome());
        System.out.println("Idade = " + getIdade());
        System.out.println();
    }

}

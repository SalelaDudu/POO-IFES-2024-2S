class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.email = "usuario@gmail.com";
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    
    public String getNome() {
        return nome;
    }
}

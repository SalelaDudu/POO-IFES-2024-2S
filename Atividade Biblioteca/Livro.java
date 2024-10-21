class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado; 

    public Livro(String titulo, String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDados(){
        System.err.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nPublicacao "+ getAnoPublicado());
    }
}

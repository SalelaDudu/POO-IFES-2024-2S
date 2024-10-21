class Main{

    public static void main(String[] args){

        Usuario u1 = new Usuario("Paulo", 12);
        Usuario u2 = new Usuario("Pedro","pedro@email.com",125, "20/02/2019");

        Livro l1 = new Livro("Percy Jackson", "Kentaro Myura", 1990);
        Livro l2 = new Livro("Codigo da vinci", "Diogenes Souza", 1321);

        Emprestimo e1 = new Emprestimo(u2, l1,"21/10/2024","28/10/2024");

        e1.exibirDados();
    }

}
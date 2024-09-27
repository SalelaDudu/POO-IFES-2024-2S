public class Main {
    public static void main(String[] args){
        PessoaFisica p1 = new PessoaFisica(001, "Seu Juca", 0, 112, "BLA");        
        PessoaJuridica p2 = new PessoaJuridica(0015, "Seu Antenor", 0, 121245, "Empresa", "LTDA");

        System.out.println(p1.getLimite());
        System.out.println(p2.getLimite());        
    }
}

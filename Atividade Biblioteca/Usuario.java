class Usuario extends Pessoa{
        private int id;
        private String dataCadastro;

        public Usuario(String nome,String email,int id, String dataCadastro){
            super(nome,email);
            this.id = id;
            this.dataCadastro = dataCadastro;
        }
        public Usuario(String nome, int id){
            super(nome);
            this.id = id;
        }

        public void setDataCadastro(String dataCadastro) {
            this.dataCadastro = dataCadastro;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getDataCadastro() {
            return dataCadastro;
        }
        public int getId() {
            return id;
        }

        public void exibirDados(){
            System.err.println("Usuario: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nID: "+ getId() + "\nData Cadastro: " + getDataCadastro());
        }

}

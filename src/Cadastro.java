public class Cadastro {
    private String senha;

    public Cadastro(String senha) {
        this.senha = senha;
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha não é valida");
        }
    }
}

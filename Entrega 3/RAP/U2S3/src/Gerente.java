public class Gerente extends Funcionario {
    //ATRIBUTOS
    int senha = 123456;
    int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, int senha){
        this.nome = nome;
        this.senha = senha;
    }

    public boolean autenticar(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
}

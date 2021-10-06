public class Programa {
    public static void main (String[] args){
        /*Aluno a1 = recuperaAluno();

        a1.imprimirContrato();*/

        Aluno joe = new Aluno();
        joe.setNome("Joe Doe");
        joe.setCpf("123123123");

        joe.imprimirContrato();
    }

    private static Aluno recuperaAluno() {
        return recuperaAlunoParticular();
    }

    private static Aluno recuperaAlunoParticular() {
        AlunoParticular aluno = new AlunoParticular();
        aluno.setMatricula(123123);
        aluno.setNome("Joao");
        aluno.setCpf("00000");

        aluno.setPercentualDeDesconto(10);

        return null;
    }

    private static Aluno recuperaAlunoFies() {
        AlunoFies aluno = new AlunoFies();
        aluno.setMatricula(321321);
        aluno.setNome("Maria");
        aluno.setCpf("11111");

        aluno.setNumeroContrato("12345");

        return null;
    }
}

public class AlunoParticular extends Aluno {
    private double percentualDeDesconto;
    private Endereco enderecoCobranca;

    public double getPercentualDeDesconto(){
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(double valor){
        percentualDeDesconto = valor;
    }

    public Endereco getEnderecoCobranca(){
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco valor){
        enderecoCobranca = valor;
    }

    public void imprimirContrato(){
        super.imprimirContrato();
        System.out.printf("\t Percentual de desconto: %f\n", percentualDeDesconto);
    }

    public void setMatricula(int i) {
    }
}

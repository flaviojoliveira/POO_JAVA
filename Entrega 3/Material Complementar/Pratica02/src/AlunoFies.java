import java.util.Date;

public class AlunoFies extends Aluno {
    private String numeroContrato;
    private Date dataDeValidade;

    public String getNumeroContrato(){
        return numeroContrato;

    }
    public void setNumeroContrato(String valor){
        numeroContrato = valor;
    }

    public Date getdataDeValidade(){
        return dataDeValidade;

    }
    public void setdataDeValidade(Date valor){
        dataDeValidade = valor;
    }

    public void imprimirContrato(){
        super.imprimirContrato();
        System.out.printf("\t Numero Contrato: %s\n", numeroContrato);
    }
}

// \
public class Aluno {
    private String matricula;
	private String nome;
	private String cpf;

    private static int contaAlunos;

    public Aluno() {
        contaAlunos++;
        setMatricula("20190000000" + String.valueOf(contaAlunos));
    }
	
	public Aluno(String nome, String cpf) {
		setMatricula (matricula);
		setNome (nome);
		setCpf (cpf);
	}

    public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String valor) {
		matricula = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String valor) {
		nome = valor;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String valor) {
		cpf = valor;
	}

    public void imprimirContrato(){
        System.out.printf("Contrato entre aluno e universidade \n" + "\t Matricula: $s\n" + "\t Nome: $s\n" + "\t CPF: $s\n", matricula, nome, cpf);
    }
}


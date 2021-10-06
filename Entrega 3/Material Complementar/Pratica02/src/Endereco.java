public class Endereco {
    private String logradouro;
	private int numero;
	private String bairro;

    public Endereco(){ }
    public Endereco(String logradouro, int numero, String bairro){
        setLogradouro(logradouro);
        setNumero(numero);
        setBairro(bairro);
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String valor){
        logradouro = valor;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int valor){
        numero = valor;
    }

    public String getBairro(){
        return bairro;
    }
    public void setBairro(String valor){
        bairro = valor;
    }
}

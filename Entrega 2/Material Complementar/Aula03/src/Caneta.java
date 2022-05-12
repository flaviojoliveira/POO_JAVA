public class Caneta {
    public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void Status() {
		System.out.println("--------------------------");
		System.out.println("Uma caneta:");
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Tampada: "+this.tampada);
		System.out.println("Carga atual: "+this.carga);
		System.out.println("--------------------------");
	}
	
	public String Rabiscar() {
		if (this.tampada) {
			return ("Caneta tampada");
		}			
		else
			return("Rabiscando");
	}
	
	public void Tampar() {
		this.tampada = true;
	}
	
	public void Destampar() {
		this.tampada = false;		
	}
}

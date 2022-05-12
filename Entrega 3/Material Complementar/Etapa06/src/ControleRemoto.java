public class ControleRemoto implements Controlador{
    //Atributos
	private int volume;
	private boolean ligada;
	private boolean tocando;
	//Construtor
	public ControleRemoto(){
		setVolume(20);
		setLigada(false);
		setTocando(true);
	}
	//Gets e Sets	
	private int getVolume() {
		return this.volume;
	}
	
	private void setVolume(int v) {
		this.volume = v;	
	}
	
	private boolean getLigada() {
		return this.ligada;
	}
	
	private void setLigada(boolean estado) {
		this.ligada = estado;
	}
	
	private boolean getTocando(){
		return this.tocando;
	}
	
	private void setTocando(boolean estado){
		this.tocando = estado;
	}
	//Interface
	@Override //Sobrescrever || Sobrepor 
	public void Ligar() {
		if (!getLigada()) {
			this.setLigada(true);
		}else {
			System.out.println("A TV já está ligada.");
		}
	}
	
	public void Desligar() {
		if (getLigada()) {
			this.setLigada(false);
		}else {
			System.out.println("A TV já está desligada");
		}
	}

	public void abrirMenu() {
		String estado;
		if (getLigada()) {
			estado = "Ligada";
			System.out.println("---------Controle-----------");
			System.out.println("Estado: "+estado);
			System.out.print("Volume:"+this.getVolume()+' ');
			for (int i = 0; i <= this.getVolume(); i+=10)
			System.out.print('|');
			System.out.println("\nPlay: "+this.getTocando());		
			System.out.println("----------------------------");
		}
		else {
			System.out.println("Primeira ligue a TV");
		}	
	}
	
	public void fecharMenu() {
		System.out.println(".... Fechando menu....");
	}

	public void maisVolume() {
		if (this.getLigada() && (this.getVolume() < 100)) {
			this.setVolume(this.getVolume() + 5);
		}else
		{
			System.out.println("Volume max. atingido");
		}
	}

	public void menosVolume() {
		if (this.getLigada() && (this.getVolume() > 0)) {
			this.setVolume(this.getVolume() - 5);
		}
	}
	
	public void ligarMudo() {
		if ((this.getLigada()) && (this.getVolume() > 0)) {
			this.setVolume(0);
		}
	}
	
	public void desligarMudo() {
		if ((this.getLigada()) && (this.getVolume() == 0)) {
			volume = 50;
		}
	}
	
	public void play() {
		if ((this.getLigada()) && (!getTocando()) ) {
			this.setTocando(true);
		}		
	}
	
	public void pause() {
		if ((this.getLigada()) && (getTocando())) {
			this.setTocando(true);
		}		
	}
}

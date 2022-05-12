public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //METODOS
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void Status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if (peso < 52.2){
            this.categoria = "Inválido";
        } else if(peso <= 70.3) {
            this.categoria = "Leve";
        }   else if(peso <= 82.9){
            this.categoria = "Médio";
        }   else if(peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

}

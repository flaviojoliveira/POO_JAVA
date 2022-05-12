public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}

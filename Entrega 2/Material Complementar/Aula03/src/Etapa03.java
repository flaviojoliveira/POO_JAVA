public class Etapa03 {
        public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.Tampar();
        c1.Status();
        System.out.println(c1.Rabiscar());
    }
    
}

public class Test {
    public static void main(String[] argrs){
        Gerente g1 = new Gerente("Nome", 0);
        Gerente g2 = new Gerente("Nome 1", 123456);
        Gerente g3 = new Gerente("Nome 2", 123456);


        if(g1.autenticar(123456)){
            System.out.printf("O nome do gerente é = %s", g1.nome);
        }
        if(g2.autenticar(123456)){
            System.out.printf("O nome do gerente é = %s", g1.nome);
        }
        if(g3.autenticar(123456)){
            System.out.printf("O nome do gerente é = %s", g1.nome);
        }
    }
}

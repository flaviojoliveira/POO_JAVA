public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    String inicioDoEvento;
    String fimDoEvento;
    int numeroDePartivcipantes;



    public EventoAcademico(String nome, String local, String inicio, String fim, int nParticipantes){
        this.nomeDoEvento = nome;
        this.localDoEvento = local;
        this.inicioDoEvento = inicio;
        this.fimDoEvento = fim;
        this.numeroDePartivcipantes = nParticipantes;
    }

    void gerarRelatorio(){
        System.out.println("================ "+this.nomeDoEvento+" ================");
        System.out.println("\tlocal: \t\t\t|"+this.localDoEvento+" ");
        System.out.println("\tinicio: \t\t|"+this.inicioDoEvento+" ");
        System.out.println("\tfim: \t\t\t|"+this.fimDoEvento+" ");
        System.out.println("\tN Participantes:\t|"+this.numeroDePartivcipantes+" ");
    };
}

class maini{
    public static void main(String[] args) {
        EventoAcademico ev1 = new EventoAcademico("comem come", "pitagoras", "02/02","05/02", 15);
        ev1.gerarRelatorio();
    }
}
public class EventoAcademico {
    
    // ATRIBUTOS
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

    // MÉTODOS
    void gerarRelatorio(){
        System.out.println("================ "+this.nomeDoEvento+" ================");
        System.out.println("Local: "+this.localDoEvento+" ");
        System.out.println("Ínicio do evento: "+this.inicioDoEvento+" ");
        System.out.println("Fim do Evento: "+this.fimDoEvento+" ");
        System.out.println("Número de Participantes: "+this.numeroDePartivcipantes+" ");
    };

    // ATRIBUI OS DADOS DO EVENTO E GERA O RELATÓRIO
    static class maini{
        public static void main(String[] args) {
            EventoAcademico ev1 = new EventoAcademico("OFICIAL 01", "PITÁGORAS", "08/09","04/10", 7);
            ev1.gerarRelatorio();
        }
}
}


import entities.Consulta;
import entities.Paciente;
import resources.Agenda;

public class App {
    public static void main(String[] args) {
        Consulta consulta1 = new Consulta(0,0,0,0,null);
        Consulta consulta2 = new Consulta(0,0,0,0,null);

        Agenda agenda = new Agenda();

        agenda.adicionar(consulta1);
        agenda.adicionar(consulta2);
    }
}

package resources;

import entities.Consulta;
import entities.Paciente;
import entities.exceptions.ConsultaExceptions;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Consulta> consultas = new ArrayList<Consulta>();

    //MÉTODO PARA ADD AS CONSULTAS + EXCEÇÃO
    public void adicionar(Consulta consulta){

        if(disponibilidade(consulta)){
            this.consultas.add(consulta);
            System.out.println("Add sucess");
        } else {
            throw new ConsultaExceptions("Horário OCUPADO!");
        }
    }

    public boolean disponibilidade(Consulta consulta){
        boolean disponibilidade = true;

        for(Consulta consult: this.consultas) {
            if(consult.equals(consulta)){
                disponibilidade = false;
            }
        };
        return disponibilidade;
    }
}

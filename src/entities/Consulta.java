package entities;

import java.util.Objects;

public class Consulta {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int status;

    private Paciente paciente;


    public Consulta(int dia, int mes, int ano, int hora, Paciente paciente) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.status = 0;
        this.paciente = paciente;
    }

    public String mostrar(){
        return "Consulta{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", hora=" + hora +
                ", status=" + status +
                ", paciente=" + paciente.mostrar() +
                '}';
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return dia == consulta.dia && mes == consulta.mes && ano == consulta.ano && hora == consulta.hora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, ano, hora);
    }

}

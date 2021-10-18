package ieasfm.org.ReapasoJava.poo;

import java.util.List;
import java.util.Objects;

public class Grupo {
    private String letra;
    private int curso;
    private String titulo;
    private List<Alumno> alumnos;


    public Grupo(String letra, int curso, String titulo, List<Alumno> alumnos) {
        this.letra = letra;
        this.curso = curso;
        this.titulo = titulo;
        this.alumnos = alumnos;
    }


    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo that = (Grupo) o;
        return curso == that.curso && Objects.equals(letra, that.letra) && Objects.equals(titulo, that.titulo) && Objects.equals(alumnos, that.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letra, curso, titulo, alumnos);
    }
}

package ieasfm.org.ReapasoJava.poo;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Instituto {
    private String nombreInstituto;
    private String dirreccion;
    private List<Grupo> grupos;

    public Instituto(String nombreInstituto, String dirreccion, List<Grupo> grupos) {
        this.nombreInstituto = nombreInstituto;
        this.dirreccion = dirreccion;
        this.grupos = grupos;
    }


    public List<Alumno> mostrarTodosAlumnos() {
        List<Alumno> alumnos = new LinkedList<>();
        for (Grupo grupo : grupos) {
            alumnos.addAll(grupo.getAlumnos());
        }

        return alumnos;
    }

    //dado un DNI, devolver alumno

    public boolean checkAlumnoExists(String dni) {
        boolean exists = false;

        for (Alumno alumno :
                mostrarTodosAlumnos()) {
            if (alumno.getDni().equals(dni)) {
                exists = true;
            }
        }


        if (mostrarTodosAlumnos().contains(dni)){

        }

        return exists;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public List<Grupo> getListaGrupos() {
        return grupos;
    }

    public void setListaGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombreInstituto, instituto.nombreInstituto) && Objects.equals(dirreccion, instituto.dirreccion) && Objects.equals(grupos, instituto.grupos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreInstituto, dirreccion, grupos);
    }
}

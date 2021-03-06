package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")


public class Estudiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 8, nullable = false)
    private String serie;

    @Column(name = "estadoEgreso", length = 5, nullable = false)
    private String estadoEgreso; // Si , NO;

    public Estudiante() {
    }

    public Estudiante(Long idpersona, String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento, String codigo, String serie, String estadoEgreso) {
        super(idpersona, nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.serie = serie;
        this.estadoEgreso = estadoEgreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

}

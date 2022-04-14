package edu.elp.siselp.entity;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")

public class Docente extends Persona{

    @Column(name = "cod_Docente", length = 9 ,nullable = false)
    private  String codDocente;

    @Column(name = "Iden_Docente", length = 15 , nullable = false)
    private String IdenDocente;

    public Docente() {
    }

    public Docente(String codDocente, String idenDocente) {
        this.codDocente = codDocente;
        IdenDocente = idenDocente;
    }

    public Docente(Long idpersona, String codDocente, String idenDocente) {
        super(idpersona);
        this.codDocente = codDocente;
        IdenDocente = idenDocente;
    }

    public Docente(Long idpersona, String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento, String codDocente, String idenDocente) {
        super(idpersona, nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        this.codDocente = codDocente;
        IdenDocente = idenDocente;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }

    public String getIdenDocente() {
        return IdenDocente;
    }

    public void setIdenDocente(String idenDocente) {
        IdenDocente = idenDocente;
    }
}

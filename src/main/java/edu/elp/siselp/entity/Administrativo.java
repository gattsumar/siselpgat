package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")

public class Administrativo extends Persona {


        @Column(name = "Area_Labor", length = 40 , nullable = false)
        public String AreaLabor;

        @Column(name = "Codigo_Admin", length = 20 , nullable = false)
        public String CodigoAdmin;

    public Administrativo() {
    }

    public Administrativo(String areaLabor, String codigoAdmin) {
        AreaLabor = areaLabor;
        CodigoAdmin = codigoAdmin;
    }

    public Administrativo(Long idpersona, String areaLabor, String codigoAdmin) {
        super(idpersona);
        AreaLabor = areaLabor;
        CodigoAdmin = codigoAdmin;
    }

    public Administrativo(Long idpersona, String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento, String areaLabor, String codigoAdmin) {
        super(idpersona, nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        AreaLabor = areaLabor;
        CodigoAdmin = codigoAdmin;
    }

    public String getAreaLabor() {
        return AreaLabor;
    }

    public void setAreaLabor(String areaLabor) {
        AreaLabor = areaLabor;
    }

    public String getCodigoAdmin() {
        return CodigoAdmin;
    }

    public void setCodigoAdmin(String codigoAdmin) {
        CodigoAdmin = codigoAdmin;
    }
}

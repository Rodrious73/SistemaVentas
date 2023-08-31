package dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.id = :id"),
    @NamedQuery(name = "Empleados.findByCorreoEmple", query = "SELECT e FROM Empleados e WHERE e.correoEmple = :correoEmple"),
    //Creamos un query personalizado para validar el correo y contrasenia
    @NamedQuery(name = "Empleados.validarInicio", query = "SELECT e FROM Empleados e WHERE e.correoEmple = :correoEmple AND e.passEmple = :passEmple"),
    @NamedQuery(name = "Empleados.findByPassEmple", query = "SELECT e FROM Empleados e WHERE e.passEmple = :passEmple"),
    @NamedQuery(name = "Empleados.findByNombreEmple", query = "SELECT e FROM Empleados e WHERE e.nombreEmple = :nombreEmple"),
    @NamedQuery(name = "Empleados.findByAppaEmple", query = "SELECT e FROM Empleados e WHERE e.appaEmple = :appaEmple"),
    @NamedQuery(name = "Empleados.findByApmaEmple", query = "SELECT e FROM Empleados e WHERE e.apmaEmple = :apmaEmple"),
    @NamedQuery(name = "Empleados.findByDniEmple", query = "SELECT e FROM Empleados e WHERE e.dniEmple = :dniEmple"),
    @NamedQuery(name = "Empleados.busquedaDNI", query = "SELECT e FROM Empleados e WHERE e.dniEmple LIKE :dniEmple"),
    @NamedQuery(name = "Empleados.findByCeluEmple", query = "SELECT e FROM Empleados e WHERE e.celuEmple = :celuEmple")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "correoEmple")
    private String correoEmple;
    @Basic(optional = false)
    @Column(name = "passEmple")
    private String passEmple;
    @Basic(optional = false)
    @Column(name = "nombreEmple")
    private String nombreEmple;
    @Basic(optional = false)
    @Column(name = "appaEmple")
    private String appaEmple;
    @Basic(optional = false)
    @Column(name = "apmaEmple")
    private String apmaEmple;
    @Basic(optional = false)
    @Column(name = "dniEmple")
    private String dniEmple;
    @Basic(optional = false)
    @Column(name = "celuEmple")
    private String celuEmple;

    public Empleados() {
    }

    public Empleados(Integer id) {
        this.id = id;
    }

    public Empleados(Integer id, String correoEmple, String passEmple, String nombreEmple, String appaEmple, String apmaEmple, String dniEmple, String celuEmple) {
        this.id = id;
        this.correoEmple = correoEmple;
        this.passEmple = passEmple;
        this.nombreEmple = nombreEmple;
        this.appaEmple = appaEmple;
        this.apmaEmple = apmaEmple;
        this.dniEmple = dniEmple;
        this.celuEmple = celuEmple;
    }

    public Empleados(String correoEmple, String passEmple, String nombreEmple, String appaEmple, String apmaEmple, String dniEmple, String celuEmple) {
        this.correoEmple = correoEmple;
        this.passEmple = passEmple;
        this.nombreEmple = nombreEmple;
        this.appaEmple = appaEmple;
        this.apmaEmple = apmaEmple;
        this.dniEmple = dniEmple;
        this.celuEmple = celuEmple;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoEmple() {
        return correoEmple;
    }

    public void setCorreoEmple(String correoEmple) {
        this.correoEmple = correoEmple;
    }

    public String getPassEmple() {
        return passEmple;
    }

    public void setPassEmple(String passEmple) {
        this.passEmple = passEmple;
    }

    public String getNombreEmple() {
        return nombreEmple;
    }

    public void setNombreEmple(String nombreEmple) {
        this.nombreEmple = nombreEmple;
    }

    public String getAppaEmple() {
        return appaEmple;
    }

    public void setAppaEmple(String appaEmple) {
        this.appaEmple = appaEmple;
    }

    public String getApmaEmple() {
        return apmaEmple;
    }

    public void setApmaEmple(String apmaEmple) {
        this.apmaEmple = apmaEmple;
    }

    public String getDniEmple() {
        return dniEmple;
    }

    public void setDniEmple(String dniEmple) {
        this.dniEmple = dniEmple;
    }

    public String getCeluEmple() {
        return celuEmple;
    }

    public void setCeluEmple(String celuEmple) {
        this.celuEmple = celuEmple;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Empleados[ id=" + id + " ]";
    }
    
}

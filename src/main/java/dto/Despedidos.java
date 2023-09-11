package dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "despedidos")
@NamedQueries({
    @NamedQuery(name = "Despedidos.findAll", query = "SELECT d FROM Despedidos d"),
    @NamedQuery(name = "Despedidos.findByIdEmp", query = "SELECT d FROM Despedidos d WHERE d.idEmp = :idEmp"),
    @NamedQuery(name = "Despedidos.findByIdEmple", query = "SELECT d FROM Despedidos d WHERE d.idEmple = :idEmple"),
    @NamedQuery(name = "Despedidos.findByCorreoEmple", query = "SELECT d FROM Despedidos d WHERE d.correoEmple = :correoEmple"),
    @NamedQuery(name = "Despedidos.findByPassEmple", query = "SELECT d FROM Despedidos d WHERE d.passEmple = :passEmple"),
    @NamedQuery(name = "Despedidos.findByNombreEmple", query = "SELECT d FROM Despedidos d WHERE d.nombreEmple = :nombreEmple"),
    @NamedQuery(name = "Despedidos.findByAppaEmple", query = "SELECT d FROM Despedidos d WHERE d.appaEmple = :appaEmple"),
    @NamedQuery(name = "Despedidos.findByApmaEmple", query = "SELECT d FROM Despedidos d WHERE d.apmaEmple = :apmaEmple"),
    @NamedQuery(name = "Despedidos.findByDniEmple", query = "SELECT d FROM Despedidos d WHERE d.dniEmple = :dniEmple"),
    @NamedQuery(name = "Despedidos.buscarEmpleDni", query = "SELECT d FROM Despedidos d WHERE d.dniEmple LIKE :dniEmple"),
    @NamedQuery(name = "Despedidos.findByCeluEmple", query = "SELECT d FROM Despedidos d WHERE d.celuEmple = :celuEmple"),
    @NamedQuery(name = "Despedidos.findByFechades", query = "SELECT d FROM Despedidos d WHERE d.fechades = :fechades")})
public class Despedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmp")
    private Integer idEmp;
    @Basic(optional = false)
    @Column(name = "idEmple")
    private int idEmple;
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
    @Basic(optional = false)
    @Column(name = "fechades")
    @Temporal(TemporalType.DATE)
    private Date fechades;

    public Despedidos() {
    }

    public Despedidos(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Despedidos(Integer idEmp, int idEmple, String correoEmple, String passEmple, String nombreEmple, String appaEmple, String apmaEmple, String dniEmple, String celuEmple, Date fechades) {
        this.idEmp = idEmp;
        this.idEmple = idEmple;
        this.correoEmple = correoEmple;
        this.passEmple = passEmple;
        this.nombreEmple = nombreEmple;
        this.appaEmple = appaEmple;
        this.apmaEmple = apmaEmple;
        this.dniEmple = dniEmple;
        this.celuEmple = celuEmple;
        this.fechades = fechades;
    }

    public Despedidos(int idEmple, String correoEmple, String passEmple, String nombreEmple, String appaEmple, String apmaEmple, String dniEmple, String celuEmple, Date fechades) {
        this.idEmple = idEmple;
        this.correoEmple = correoEmple;
        this.passEmple = passEmple;
        this.nombreEmple = nombreEmple;
        this.appaEmple = appaEmple;
        this.apmaEmple = apmaEmple;
        this.dniEmple = dniEmple;
        this.celuEmple = celuEmple;
        this.fechades = fechades;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public int getIdEmple() {
        return idEmple;
    }

    public void setIdEmple(int idEmple) {
        this.idEmple = idEmple;
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

    public Date getFechades() {
        return fechades;
    }

    public void setFechades(Date fechades) {
        this.fechades = fechades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Despedidos)) {
            return false;
        }
        Despedidos other = (Despedidos) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Despedidos[ idEmp=" + idEmp + " ]";
    }
    
}

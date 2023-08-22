
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
@Table(name = "reportes")
@NamedQueries({
    @NamedQuery(name = "Reportes.findAll", query = "SELECT r FROM Reportes r"),
    @NamedQuery(name = "Reportes.findByIdRepo", query = "SELECT r FROM Reportes r WHERE r.idRepo = :idRepo"),
    @NamedQuery(name = "Reportes.findByIdEmple", query = "SELECT r FROM Reportes r WHERE r.idEmple = :idEmple"),
    @NamedQuery(name = "Reportes.findByAsunto", query = "SELECT r FROM Reportes r WHERE r.asunto = :asunto"),
    @NamedQuery(name = "Reportes.findByDescripcion", query = "SELECT r FROM Reportes r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Reportes.findByFecha", query = "SELECT r FROM Reportes r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Reportes.findByRespuesta", query = "SELECT r FROM Reportes r WHERE r.respuesta = :respuesta"),
    @NamedQuery(name = "Reportes.findByIdAdmin", query = "SELECT r FROM Reportes r WHERE r.idAdmin = :idAdmin")})
public class Reportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRepo")
    private Integer idRepo;
    @Basic(optional = false)
    @Column(name = "idEmple")
    private int idEmple;
    @Basic(optional = false)
    @Column(name = "asunto")
    private String asunto;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "respuesta")
    private String respuesta;
    @Basic(optional = false)
    @Column(name = "idAdmin")
    private int idAdmin;

    public Reportes() {
    }

    public Reportes(Integer idRepo) {
        this.idRepo = idRepo;
    }

    public Reportes(Integer idRepo, int idEmple, String asunto, String descripcion, Date fecha, String respuesta, int idAdmin) {
        this.idRepo = idRepo;
        this.idEmple = idEmple;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.respuesta = respuesta;
        this.idAdmin = idAdmin;
    }
    
    public Reportes(int idEmple, String asunto, String descripcion, Date fecha, String respuesta, int idAdmin) {
        this.idEmple = idEmple;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.respuesta = respuesta;
        this.idAdmin = idAdmin;
    }

    public Integer getIdRepo() {
        return idRepo;
    }

    public void setIdRepo(Integer idRepo) {
        this.idRepo = idRepo;
    }

    public int getIdEmple() {
        return idEmple;
    }

    public void setIdEmple(int idEmple) {
        this.idEmple = idEmple;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRepo != null ? idRepo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reportes)) {
            return false;
        }
        Reportes other = (Reportes) object;
        if ((this.idRepo == null && other.idRepo != null) || (this.idRepo != null && !this.idRepo.equals(other.idRepo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Reportes[ idRepo=" + idRepo + " ]";
    }
    
}

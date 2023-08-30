/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author rodrious
 */
@Entity
@Table(name = "proveedores")
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByIdProve", query = "SELECT p FROM Proveedores p WHERE p.idProve = :idProve"),
    @NamedQuery(name = "Proveedores.findByEmpreProve", query = "SELECT p FROM Proveedores p WHERE p.empreProve = :empreProve"),
    @NamedQuery(name = "Proveedores.findByRucProve", query = "SELECT p FROM Proveedores p WHERE p.rucProve = :rucProve"),
    @NamedQuery(name = "Proveedores.busquedaRuc", query = "SELECT p FROM Proveedores p WHERE p.rucProve LIKE :rucProve"),
    @NamedQuery(name = "Proveedores.findByDireccionProve", query = "SELECT p FROM Proveedores p WHERE p.direccionProve = :direccionProve"),
    @NamedQuery(name = "Proveedores.findByTelefonoProve", query = "SELECT p FROM Proveedores p WHERE p.telefonoProve = :telefonoProve"),
    @NamedQuery(name = "Proveedores.findByCelProve", query = "SELECT p FROM Proveedores p WHERE p.celProve = :celProve")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProve")
    private Integer idProve;
    @Basic(optional = false)
    @Column(name = "empreProve")
    private String empreProve;
    @Basic(optional = false)
    @Column(name = "rucProve")
    private String rucProve;
    @Basic(optional = false)
    @Column(name = "direccionProve")
    private String direccionProve;
    @Basic(optional = false)
    @Column(name = "telefonoProve")
    private String telefonoProve;
    @Basic(optional = false)
    @Column(name = "celProve")
    private String celProve;

    public Proveedores() {
    }

    public Proveedores(Integer idProve) {
        this.idProve = idProve;
    }

    public Proveedores(Integer idProve, String empreProve, String rucProve, String direccionProve, String telefonoProve, String celProve) {
        this.idProve = idProve;
        this.empreProve = empreProve;
        this.rucProve = rucProve;
        this.direccionProve = direccionProve;
        this.telefonoProve = telefonoProve;
        this.celProve = celProve;
    }

    public Proveedores(String empreProve, String rucProve, String direccionProve, String telefonoProve, String celProve) {
        this.empreProve = empreProve;
        this.rucProve = rucProve;
        this.direccionProve = direccionProve;
        this.telefonoProve = telefonoProve;
        this.celProve = celProve;
    }

    public Integer getIdProve() {
        return idProve;
    }

    public void setIdProve(Integer idProve) {
        this.idProve = idProve;
    }

    public String getEmpreProve() {
        return empreProve;
    }

    public void setEmpreProve(String empreProve) {
        this.empreProve = empreProve;
    }

    public String getRucProve() {
        return rucProve;
    }

    public void setRucProve(String rucProve) {
        this.rucProve = rucProve;
    }

    public String getDireccionProve() {
        return direccionProve;
    }

    public void setDireccionProve(String direccionProve) {
        this.direccionProve = direccionProve;
    }

    public String getTelefonoProve() {
        return telefonoProve;
    }

    public void setTelefonoProve(String telefonoProve) {
        this.telefonoProve = telefonoProve;
    }

    public String getCelProve() {
        return celProve;
    }

    public void setCelProve(String celProve) {
        this.celProve = celProve;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProve != null ? idProve.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idProve == null && other.idProve != null) || (this.idProve != null && !this.idProve.equals(other.idProve))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Proveedores[ idProve=" + idProve + " ]";
    }
    
}

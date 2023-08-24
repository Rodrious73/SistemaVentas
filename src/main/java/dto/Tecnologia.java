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
@Table(name = "tecnologia")
@NamedQueries({
    @NamedQuery(name = "Tecnologia.findAll", query = "SELECT t FROM Tecnologia t"),
    @NamedQuery(name = "Tecnologia.findByIdproducto", query = "SELECT t FROM Tecnologia t WHERE t.idproducto = :idproducto"),
    @NamedQuery(name = "Tecnologia.findByNombreproducto", query = "SELECT t FROM Tecnologia t WHERE t.nombreproducto = :nombreproducto"),
    @NamedQuery(name = "Tecnologia.findByIdProveedor", query = "SELECT t FROM Tecnologia t WHERE t.idProveedor = :idProveedor"),
    @NamedQuery(name = "Tecnologia.findByCantidad", query = "SELECT t FROM Tecnologia t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Tecnologia.findByPrecio", query = "SELECT t FROM Tecnologia t WHERE t.precio = :precio"),
    @NamedQuery(name = "Tecnologia.findByMarca", query = "SELECT t FROM Tecnologia t WHERE t.marca = :marca"),
    @NamedQuery(name = "Tecnologia.findByCategoria", query = "SELECT t FROM Tecnologia t WHERE t.categoria = :categoria")})
public class Tecnologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto")
    private Integer idproducto;
    @Basic(optional = false)
    @Column(name = "nombreproducto")
    private String nombreproducto;
    @Basic(optional = false)
    @Column(name = "idProveedor")
    private int idProveedor;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Tecnologia() {
    }

    public Tecnologia(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Tecnologia(Integer idproducto, String nombreproducto, int idProveedor, int cantidad, double precio, String marca, String categoria) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.idProveedor = idProveedor;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Tecnologia(String nombreproducto, int idProveedor, int cantidad, double precio, String marca, String categoria) {
        this.nombreproducto = nombreproducto;
        this.idProveedor = idProveedor;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnologia)) {
            return false;
        }
        Tecnologia other = (Tecnologia) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Tecnologia[ idproducto=" + idproducto + " ]";
    }
    
}

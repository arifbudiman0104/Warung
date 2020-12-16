/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dagangan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Arif Budiman Ar
 */
@Entity
@Table(name = "DAGANGAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dagangan.findAll", query = "SELECT d FROM Dagangan d")
    , @NamedQuery(name = "Dagangan.findById", query = "SELECT d FROM Dagangan d WHERE d.id = :id")
    , @NamedQuery(name = "Dagangan.findByNamadagangan", query = "SELECT d FROM Dagangan d WHERE d.namadagangan = :namadagangan")
    , @NamedQuery(name = "Dagangan.findByHarga", query = "SELECT d FROM Dagangan d WHERE d.harga = :harga")
    , @NamedQuery(name = "Dagangan.findByJumlah", query = "SELECT d FROM Dagangan d WHERE d.jumlah = :jumlah")})
public class Dagangan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NAMADAGANGAN")
    private String namadagangan;
    @Column(name = "HARGA")
    private Integer harga;
    @Column(name = "JUMLAH")
    private Integer jumlah;

    public Dagangan() {
    }

    public Dagangan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamadagangan() {
        return namadagangan;
    }

    public void setNamadagangan(String namadagangan) {
        this.namadagangan = namadagangan;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
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
        if (!(object instanceof Dagangan)) {
            return false;
        }
        Dagangan other = (Dagangan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dagangan.Dagangan[ id=" + id + " ]";
    }
    
}

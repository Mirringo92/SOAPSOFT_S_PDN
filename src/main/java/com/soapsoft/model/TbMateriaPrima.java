package com.soapsoft.model;
// Generated 20/11/2017 08:24:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbMateriaPrima generated by hbm2java
 */
@Entity
@Table(name="tb_materia_prima"
    ,catalog="soap_soft"
)
public class TbMateriaPrima  implements java.io.Serializable {


     private Integer id;
     private TbUbicacion tbUbicacion;
     private String referencia;
     private String descripcion;
     private String um;
     private float stock;
     private String creadorPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;
     private Set tbDetalleEntradaMateriaPrimas = new HashSet(0);
     private Set tbDetalleSalidaMateriaPrimas = new HashSet(0);
     private Set tbDetalleOrdenCompras = new HashSet(0);

    public TbMateriaPrima() {
    }

	
    public TbMateriaPrima(TbUbicacion tbUbicacion, String referencia, String descripcion, String um, float stock, String creadorPor, Date creadoEn) {
        this.tbUbicacion = tbUbicacion;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.um = um;
        this.stock = stock;
        this.creadorPor = creadorPor;
        this.creadoEn = creadoEn;
    }
    public TbMateriaPrima(TbUbicacion tbUbicacion, String referencia, String descripcion, String um, float stock, String creadorPor, Date creadoEn, String modificadoPor, Date modificadoEn, Set tbDetalleEntradaMateriaPrimas, Set tbDetalleSalidaMateriaPrimas, Set tbDetalleOrdenCompras) {
       this.tbUbicacion = tbUbicacion;
       this.referencia = referencia;
       this.descripcion = descripcion;
       this.um = um;
       this.stock = stock;
       this.creadorPor = creadorPor;
       this.creadoEn = creadoEn;
       this.modificadoPor = modificadoPor;
       this.modificadoEn = modificadoEn;
       this.tbDetalleEntradaMateriaPrimas = tbDetalleEntradaMateriaPrimas;
       this.tbDetalleSalidaMateriaPrimas = tbDetalleSalidaMateriaPrimas;
       this.tbDetalleOrdenCompras = tbDetalleOrdenCompras;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ubicacion", nullable=false)
    public TbUbicacion getTbUbicacion() {
        return this.tbUbicacion;
    }
    
    public void setTbUbicacion(TbUbicacion tbUbicacion) {
        this.tbUbicacion = tbUbicacion;
    }

    
    @Column(name="referencia", nullable=false, length=100)
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    @Column(name="descripcion", nullable=false, length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="um", nullable=false, length=10)
    public String getUm() {
        return this.um;
    }
    
    public void setUm(String um) {
        this.um = um;
    }

    
    @Column(name="stock", nullable=false, precision=12, scale=0)
    public float getStock() {
        return this.stock;
    }
    
    public void setStock(float stock) {
        this.stock = stock;
    }

    
    @Column(name="creadorPor", nullable=false, length=50)
    public String getCreadorPor() {
        return this.creadorPor;
    }
    
    public void setCreadorPor(String creadorPor) {
        this.creadorPor = creadorPor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creadoEn", nullable=false, length=19)
    public Date getCreadoEn() {
        return this.creadoEn;
    }
    
    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    
    @Column(name="modificadoPor", length=50)
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modificadoEn", length=19)
    public Date getModificadoEn() {
        return this.modificadoEn;
    }
    
    public void setModificadoEn(Date modificadoEn) {
        this.modificadoEn = modificadoEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbMateriaPrima")
    public Set getTbDetalleEntradaMateriaPrimas() {
        return this.tbDetalleEntradaMateriaPrimas;
    }
    
    public void setTbDetalleEntradaMateriaPrimas(Set tbDetalleEntradaMateriaPrimas) {
        this.tbDetalleEntradaMateriaPrimas = tbDetalleEntradaMateriaPrimas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbMateriaPrima")
    public Set getTbDetalleSalidaMateriaPrimas() {
        return this.tbDetalleSalidaMateriaPrimas;
    }
    
    public void setTbDetalleSalidaMateriaPrimas(Set tbDetalleSalidaMateriaPrimas) {
        this.tbDetalleSalidaMateriaPrimas = tbDetalleSalidaMateriaPrimas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbMateriaPrima")
    public Set getTbDetalleOrdenCompras() {
        return this.tbDetalleOrdenCompras;
    }
    
    public void setTbDetalleOrdenCompras(Set tbDetalleOrdenCompras) {
        this.tbDetalleOrdenCompras = tbDetalleOrdenCompras;
    }




}



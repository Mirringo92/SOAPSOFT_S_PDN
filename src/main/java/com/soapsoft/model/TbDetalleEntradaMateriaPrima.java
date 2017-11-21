package com.soapsoft.model;
// Generated 20/11/2017 08:24:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbDetalleEntradaMateriaPrima generated by hbm2java
 */
@Entity
@Table(name="tb_detalle_entrada_materia_prima"
    ,catalog="soap_soft"
)
public class TbDetalleEntradaMateriaPrima  implements java.io.Serializable {


     private Integer id;
     private TbEntradaMateriaPrima tbEntradaMateriaPrima;
     private TbMateriaPrima tbMateriaPrima;
     private int cantidad;
     private String creadoPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;

    public TbDetalleEntradaMateriaPrima() {
    }

	
    public TbDetalleEntradaMateriaPrima(TbEntradaMateriaPrima tbEntradaMateriaPrima, TbMateriaPrima tbMateriaPrima, int cantidad, String creadoPor, Date creadoEn) {
        this.tbEntradaMateriaPrima = tbEntradaMateriaPrima;
        this.tbMateriaPrima = tbMateriaPrima;
        this.cantidad = cantidad;
        this.creadoPor = creadoPor;
        this.creadoEn = creadoEn;
    }
    public TbDetalleEntradaMateriaPrima(TbEntradaMateriaPrima tbEntradaMateriaPrima, TbMateriaPrima tbMateriaPrima, int cantidad, String creadoPor, Date creadoEn, String modificadoPor, Date modificadoEn) {
       this.tbEntradaMateriaPrima = tbEntradaMateriaPrima;
       this.tbMateriaPrima = tbMateriaPrima;
       this.cantidad = cantidad;
       this.creadoPor = creadoPor;
       this.creadoEn = creadoEn;
       this.modificadoPor = modificadoPor;
       this.modificadoEn = modificadoEn;
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
    @JoinColumn(name="id_entrada_mat_prim", nullable=false)
    public TbEntradaMateriaPrima getTbEntradaMateriaPrima() {
        return this.tbEntradaMateriaPrima;
    }
    
    public void setTbEntradaMateriaPrima(TbEntradaMateriaPrima tbEntradaMateriaPrima) {
        this.tbEntradaMateriaPrima = tbEntradaMateriaPrima;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_materia_prima", nullable=false)
    public TbMateriaPrima getTbMateriaPrima() {
        return this.tbMateriaPrima;
    }
    
    public void setTbMateriaPrima(TbMateriaPrima tbMateriaPrima) {
        this.tbMateriaPrima = tbMateriaPrima;
    }

    
    @Column(name="cantidad", nullable=false)
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="creadoPor", nullable=false, length=50)
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
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




}



package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="CompraDetalle")
public class compra_detalleModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCompra", referencedColumnName = "Id", insertable = false, updatable = false)
    private compraModel idCompra;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdProducto", referencedColumnName = "Id", insertable = false, updatable = false)
    private productoModel idProducto;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdLocal", referencedColumnName = "Id", insertable = false, updatable = false)
    private localModel IdLocal;
    
    @Column(name = "Cantidad")
    private Long Cantidad;
    @Column(name = "ValorU")
    private Double ValorU;
    @Column(name = "Tax")
    private String Tax;
    @Column(name = "Operacion")
    private String Operacion;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public compraModel getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(compraModel idCompra) {
		this.idCompra = idCompra;
	}
	public productoModel getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(productoModel idProducto) {
		this.idProducto = idProducto;
	}
	public localModel getIdLocal() {
		return IdLocal;
	}
	public void setIdLocal(localModel idLocal) {
		IdLocal = idLocal;
	}
	public Long getCantidad() {
		return Cantidad;
	}
	public void setCantidad(Long cantidad) {
		Cantidad = cantidad;
	}
	public Double getValorU() {
		return ValorU;
	}
	public void setValorU(Double valorU) {
		ValorU = valorU;
	}
	public String getTax() {
		return Tax;
	}
	public void setTax(String tax) {
		Tax = tax;
	}
	public String getOperacion() {
		return Operacion;
	}
	public void setOperacion(String operacion) {
		Operacion = operacion;
	}
    
    
	
}

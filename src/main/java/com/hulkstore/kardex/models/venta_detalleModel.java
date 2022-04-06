package com.hulkstore.kardex.models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="VentaDetalle")
public class venta_detalleModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdVenta", referencedColumnName = "Id", insertable = false, updatable = false)
    private ventaModel IdVenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdProducto", referencedColumnName = "Id", insertable = false, updatable = false)
    private productoModel IdProducto;
    
	@Column(name = "Cantidad")
    private Long Cantidad;
	
	@Column(name = "Tax")
    private String Tax;
	@Column(name = "Operacion")
    private String Operacion;
	
	@Column(name = "ValorU")
    private Double ValorU;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public ventaModel getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(ventaModel idVenta) {
		IdVenta = idVenta;
	}

	public productoModel getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(productoModel idProducto) {
		IdProducto = idProducto;
	}

	public Long getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Long cantidad) {
		Cantidad = cantidad;
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

	public Double getValorU() {
		return ValorU;
	}

	public void setValorU(Double valorU) {
		ValorU = valorU;
	}

}

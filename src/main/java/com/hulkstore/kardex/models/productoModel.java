package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Producto")
public class productoModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdTipo", referencedColumnName = "Id", insertable = false, updatable = false)
    private tipoModel IdTipo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCategoria",referencedColumnName = "Id", insertable = false, updatable = false)
    private categoriaModel IdCategoria;

	@Column(name = "Nombre")
    private String Nombre;
	@Column(name = "Medida")
    private String Medida;
	@Column(name = "Tax")
    private String Tax;
	@Column(name = "ValorU")
    private Double ValorU;
	@Column(name = "Stock")
    private Double Stock;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public tipoModel getIdTipo() {
		return IdTipo;
	}
	public void setIdTipo(tipoModel idTipo) {
		IdTipo = idTipo;
	}
	public categoriaModel getIdCategoria() {
		return IdCategoria;
	}
	public void setIdCategoria(categoriaModel idCategoria) {
		IdCategoria = idCategoria;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getMedida() {
		return Medida;
	}
	public void setMedida(String medida) {
		Medida = medida;
	}
	public String getTax() {
		return Tax;
	}
	public void setTax(String tax) {
		Tax = tax;
	}
	public Double getValorU() {
		return ValorU;
	}
	public void setValorU(Double valorU) {
		ValorU = valorU;
	}
	public Double getStock() {
		return Stock;
	}
	public void setStock(Double stock) {
		Stock = stock;
	}
	
}

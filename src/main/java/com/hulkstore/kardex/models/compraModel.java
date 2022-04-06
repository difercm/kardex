package com.hulkstore.kardex.models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="Compra")
public class compraModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdProveedor", referencedColumnName = "Id", insertable = false, updatable = false)
    private proveedorModel idProveedor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdLocal", referencedColumnName = "Id", insertable = false, updatable = false)
    private localModel IdLocal;
	
	@Column(name = "NumeroDoc")
    private String NumeroDoc;
	
	@Column(name = "Fecha")
    private Date Fecha;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public proveedorModel getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(proveedorModel idProveedor) {
		this.idProveedor = idProveedor;
	}

	public localModel getIdLocal() {
		return IdLocal;
	}

	public void setIdLocal(localModel idLocal) {
		IdLocal = idLocal;
	}

	public String getNumeroDoc() {
		return NumeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		NumeroDoc = numeroDoc;
	}
	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}
}

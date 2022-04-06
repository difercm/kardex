package com.hulkstore.kardex.models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="Venta")
public class ventaModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCliente", referencedColumnName = "Id", insertable = false, updatable = false)
    private clienteModel idCliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdLocal", referencedColumnName = "Id", insertable = false, updatable = false)
    private localModel IdLocal;
    
	@Column(name = "NumeroDocu")
    private String NumeroDocu;
	@Column(name = "Fecha")
    private Date Fecha;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public clienteModel getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(clienteModel idCliente) {
		this.idCliente = idCliente;
	}
	public localModel getIdLocal() {
		return IdLocal;
	}
	public void setIdLocal(localModel idLocal) {
		IdLocal = idLocal;
	}
	public String getNumeroDocu() {
		return NumeroDocu;
	}
	public void setNumeroDocu(String numeroDocu) {
		NumeroDocu = numeroDocu;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

}

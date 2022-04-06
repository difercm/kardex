package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Proveedor")
public class proveedorModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;


	@Column(name = "RazonSocial")
    private String RazonSocial;
	@Column(name = "RUC")
    private String RUC;
	@Column(name = "Email")
    private String Email;
	@Column(name = "Telefono")
    private String Telefono;
	@Column(name = "Direccion")
    private String Direccion;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


}

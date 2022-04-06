package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Cliente")
public class clienteModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;


	@Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Identificacion")
    private String Identificacion;
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
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getIdentificacion() {
		return Identificacion;
	}
	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
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

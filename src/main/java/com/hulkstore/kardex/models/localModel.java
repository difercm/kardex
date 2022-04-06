package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Local")
public class localModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;


	@Column(name = "Nombre")
    private String Nombre;


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

}

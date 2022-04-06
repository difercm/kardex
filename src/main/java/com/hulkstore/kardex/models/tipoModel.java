package com.hulkstore.kardex.models;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Tipo")
public class tipoModel implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;
    
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Color")
    private String Color;
    @Column(name = "Material")
    private String Material;
    
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
      }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre =Nombre;
      }
    
    
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color =Color;
      }
    
    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material =Material;
      }
    
}
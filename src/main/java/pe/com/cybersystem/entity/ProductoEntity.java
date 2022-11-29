package pe.com.cybersystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "ProductoEntity")
@Table(name = "producto")
public class ProductoEntity implements Serializable{

	public static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "idproducto ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idprod;
	@Column(name = "nombreproducto")
	private String nombreprod;
	@Column(name = "precio")
	private double precioprod;
	@Column(name = "stock")
	private int stockprod;
	@Column(name = "descripcion")
	private String descripcionprod;
	@Column(name = "estado")
	private boolean estadoprod;
	@Column(name = "marca")
	private String marcaprod;
	
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	private CategoriaEntity categoria;
	
}

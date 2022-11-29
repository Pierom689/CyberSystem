package pe.com.cybersystem.entity;

import java.io.Serializable;
import java.util.Date;

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
@Entity(name="DetalleCompraEntity")
@Table(name="detalle_compra")
public class DetalleCompraEntity implements Serializable {
	public static final long serialVersionUID = 1L; 
	@Id
	@Column(name="iddetallecompra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iddetallecompra;
	@Column(name="preciocompra")
	private Double preciocompra;
	@Column(name="cantidad")
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "idcompra")
	private CompraEntity idcompra;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private ProductoEntity idproducto;
	
	

}

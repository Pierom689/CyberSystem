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
@Entity(name = "DetalleVentaEntity")
@Table(name = "detalle_pedido")
public class DetalleVentaEntity implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "iddetallepedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iddetalle;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "precioventa")
	private double precioventa;
	@Column(name = "igv")
	private double igv;
	
	@ManyToOne
	@JoinColumn(name = "idpedido")
	private VentaEntity venta;
	
	@ManyToOne
	@JoinColumn(name = "idproducto")
	private ProductoEntity producto;
	
}

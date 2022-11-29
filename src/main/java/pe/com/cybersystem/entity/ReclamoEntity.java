package pe.com.cybersystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "ReclamoEntity")
@Table(name = "reclamos")
public class ReclamoEntity implements Serializable {
	
	public static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "idreclamo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idreclamo;
	@ManyToOne
	@JoinColumn(name = "idpedido",nullable = false)
	private VentaEntity pedido;
	
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private boolean estado;
	
	
	
}

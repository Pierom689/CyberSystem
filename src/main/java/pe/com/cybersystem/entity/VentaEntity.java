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
@Entity(name = "VentaEntity")
@Table(name = "cabecera_pedido")

public class VentaEntity implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idpedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idpedido;
	@Column(name = "estado")
	private Boolean estado;
	@Column(name = "fechaventa")
	private String fechaventa;
	
	@ManyToOne
	@JoinColumn(name = "idcliente",nullable = false)
	private UsuarioEntity usuario;
	
	@ManyToOne
	@JoinColumn(name = "idempleado",nullable = false)
	private EmpleadoEntity empleado;
}

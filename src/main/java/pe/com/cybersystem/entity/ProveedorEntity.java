package pe.com.cybersystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ProveedorEntity")
@Table(name="proveedor")
public class ProveedorEntity implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="idproveedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproveedor;
	@Column(name="nombre")
	private String nombre;
	@Column(name="ruc")
	private String ruc;
	@Column(name="razonsocial")
	private String razonsocial;
	@Column(name="direccion")
	private String direccion;
	@Column(name="email")
	private String email;
	@Column(name="telefono")
	private String telefono;
	@Column(name = "estado")
	private boolean estado;
	
	
	
	

}

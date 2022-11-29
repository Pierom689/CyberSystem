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
@Entity(name = "UsuarioEntity")
@Table(name = "cliente")
public class UsuarioEntity implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idcliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "email")
	private String email;
	@Column(name = "fechanacimiento")
	private String fecha;
	@Column(name = "documento")
	private String documento;
	@Column(name = "estado")
	private boolean estado;

}

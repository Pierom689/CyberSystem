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
@Entity(name = "CompraEntity")
@Table(name = "compras")
public class CompraEntity implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "idcompra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcompra;
	@Column(name ="fechacompra")
	private String fechacompra; 
	@Column(name = "numcomprobante")
	private String numcomprobante;
	@Column(name = "estado")
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name="idproveedor")
	private ProveedorEntity idproveedor;

}

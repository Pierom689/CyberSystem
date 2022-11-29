package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.VentaEntity;

public interface VentaService {
	public List<VentaEntity> findAll();
	public List<VentaEntity> findAllCustom();
	public Optional<VentaEntity> findById(long id);
	public VentaEntity add(VentaEntity e);
	public VentaEntity update(VentaEntity e);
	public VentaEntity delete(VentaEntity e);
}

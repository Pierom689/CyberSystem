package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.VentaEntity;
import pe.com.cybersystem.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService {
	@Autowired
	private VentaRepository repositorio;

	@Override
	public List<VentaEntity> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public List<VentaEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repositorio.findAllCustom();
	}

	@Override
	public Optional<VentaEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public VentaEntity add(VentaEntity e) {
		// TODO Auto-generated method stub
		return repositorio.save(e);
	}

	@Override
	public VentaEntity update(VentaEntity e) {
		// TODO Auto-generated method stub
		VentaEntity objventa = repositorio.getById(e.getIdpedido());
		BeanUtils.copyProperties(e, objventa);
		return repositorio.save(objventa);
	}

	@Override
	public VentaEntity delete(VentaEntity e) {
		// TODO Auto-generated method stub
		VentaEntity objventa = repositorio.getById(e.getIdpedido());
		objventa.setEstado(false);
		return repositorio.save(objventa);
	}
	
	
	
}

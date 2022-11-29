package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.DetalleCompraEntity;
import pe.com.cybersystem.repository.DetalleCompraRepository;


@Service
public class DetalleCompraServiceImpl implements DetalleCompraService {

	@Autowired
	private DetalleCompraRepository repository;
	
	
	@Override
	public List<DetalleCompraEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<DetalleCompraEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public DetalleCompraEntity add(DetalleCompraEntity d) {
		// TODO Auto-generated method stub
		return repository.save(d);
	}

	@Override
	public DetalleCompraEntity update(DetalleCompraEntity d) {
		// TODO Auto-generated method stub
		DetalleCompraEntity obj = repository.getById(d.getIddetallecompra());
		BeanUtils.copyProperties(d, obj);
		return repository.save(obj);
	}


}

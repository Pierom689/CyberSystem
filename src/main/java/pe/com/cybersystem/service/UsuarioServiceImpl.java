package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.UsuarioEntity;
import pe.com.cybersystem.repository.UsuarioRepository;



@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repositorio;

	
	@Override
	public List<UsuarioEntity> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();	
	}

	@Override
	public List<UsuarioEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repositorio.findAllCustom();
	}

	@Override
	public Optional<UsuarioEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public UsuarioEntity add(UsuarioEntity u) {
		// TODO Auto-generated method stub
		return repositorio.save(u);
	}

	@Override
	public UsuarioEntity update(UsuarioEntity u) {
		UsuarioEntity objusuario=repositorio.getById(u.getCodigo());
		BeanUtils.copyProperties(u, objusuario);
		return repositorio.save(objusuario);
	}

	@Override
	public UsuarioEntity delete(UsuarioEntity u) {
		// TODO Auto-generated method stub
		UsuarioEntity objusuario=repositorio.getById(u.getCodigo());
		objusuario.setEstado(false);
		return repositorio.save(objusuario); 	}

}

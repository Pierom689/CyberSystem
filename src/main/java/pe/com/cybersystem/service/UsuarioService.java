package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.UsuarioEntity;


public interface UsuarioService {
	public List<UsuarioEntity> findAll();
	public List<UsuarioEntity> findAllCustom();
	public Optional<UsuarioEntity> findById(long id);
	public UsuarioEntity add(UsuarioEntity u);
	public UsuarioEntity update(UsuarioEntity u);
	public UsuarioEntity delete(UsuarioEntity u);
}

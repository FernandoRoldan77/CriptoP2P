package ar.edu.unq.criptop2p.service.imp;

import java.util.List;
import java.util.Optional;

import ar.edu.unq.criptop2p.model.dto.UsuarioDTO;
import ar.edu.unq.criptop2p.service.interfaces.IUsuarioService;
import ar.edu.unq.criptop2p.utility.AutoMapperComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unq.criptop2p.model.entity.Usuario;
import ar.edu.unq.criptop2p.persistence.interfaces.IUsuarioRepository;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	private AutoMapperComponent mapperComponent;
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public List<UsuarioDTO> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return mapperComponent.ToList(usuarios, UsuarioDTO.class);
	}

	@Override
	public UsuarioDTO save(UsuarioDTO usuario) {
		Usuario usuarioEntity = mapperComponent.To(usuario, Usuario.class);
		usuarioRepository.save(usuarioEntity);
		return mapperComponent.To(usuarioEntity, UsuarioDTO.class);
	}

	@Override
	public UsuarioDTO getById(long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return mapperComponent.To(usuario.get(), UsuarioDTO.class);
	}
}

package suplefitcol.repository;

import org.springframework.data.repository.CrudRepository;

import suplefitcol.enty.Usuario;
import suplefitcol.odt.UsuarioResponse;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	void save(UsuarioResponse usuarioNuevo);


}

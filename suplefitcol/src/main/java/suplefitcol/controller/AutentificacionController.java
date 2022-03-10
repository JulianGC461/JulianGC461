package suplefitcol.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import suplefitcol.odt.UsuarioResponse;
import suplefitcol.repository.UsuarioRepository;


@RestController
public class AutentificacionController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
 @RequestMapping( 
		 path = "hola", 
		 method = RequestMethod.POST)
	 public ResponseEntity<Void> crear(@RequestBody UsuarioResponse usuarioNuevo ){

	 usuarioRepository.save(usuarioNuevo);
		 return ResponseEntity.ok().body(null);
	 }
	 
 
}
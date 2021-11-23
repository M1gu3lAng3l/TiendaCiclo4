package com.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.tienda.models.UsuarioDTO;
import com.tienda.repositories.IUsuarioDAO;

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/usuarios")
public class UserController
{
	@Autowired
	private IUsuarioDAO repository;
	@PostMapping("/usuario")
	public UsuarioDTO create(@Validated @RequestBody UsuarioDTO u)
	{
		return repository.insert(u);
		
		
	}
	@GetMapping("/")
	  public List<UsuarioDTO>readAll()
	  {
		  return repository.findAll();
	  }
	  
	  @PutMapping("usuario/{id}")
	  public UsuarioDTO update(@PathVariable String id,@Validated @RequestBody UsuarioDTO u)
	  {
		   return repository.save(u);
	  }
	  
	  @DeleteMapping("usuario/{id}")
	  public void delete(@PathVariable String id)
	  {
		  repository.deleteById(id);
	  }
	
	
}

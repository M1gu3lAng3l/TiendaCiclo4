package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.models.UsuarioDTO;

@Repository
public interface IUsuarioDAO  extends MongoRepository <UsuarioDTO,String>
{

}

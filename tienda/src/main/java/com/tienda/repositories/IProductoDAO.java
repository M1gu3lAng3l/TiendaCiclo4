package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.models.ProductoDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO,String>
{

	
}


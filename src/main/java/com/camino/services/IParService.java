package com.camino.services;

import java.util.List;

import com.camino.models.Par;

public interface IParService {

	public List<Par> findAll();
	
	public Par findById(Long id);

	public void save(Par par);
	
	public void delete(Long id);
}

package com.camino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.camino.dao.ParDao;
import com.camino.models.Par;




public class ParService implements IParService {
	
	@Autowired
	ParDao parDao;
	
	@Override
	public List<Par> findAll() {
		
		return (List<Par>) parDao.findAll();
	}

	@Override
	public Par findById(Long id) {
		
		return parDao.findById(id).orElse(null);
	}

	@Override
	public void save(Par par) {
		
		parDao.save(par);
	}

	@Override
	public void delete(Long id) {
		
		parDao.deleteById(id);
	}
	
}

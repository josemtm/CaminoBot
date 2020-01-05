package com.camino.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.camino.models.Par;


public interface ParDao extends PagingAndSortingRepository<Par,Long> {
	

}

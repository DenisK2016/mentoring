package com.dk.mentoring.service;

import com.dk.mentoring.model.Dimension;


public interface DimensionService
{
	public void deleteDimension(Long id);

	public Dimension createDimension(Dimension dimension);

	public Dimension updateDimension(Dimension dimension);

	//	public List<Dimension> getAllDimension();
	//
	//	public Dimension getDimensionById(final Long id);
	//

}

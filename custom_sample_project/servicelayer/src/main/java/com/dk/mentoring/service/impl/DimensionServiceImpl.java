package com.dk.mentoring.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.dk.mentoring.dao.DimensionDao;
import com.dk.mentoring.model.Dimension;
import com.dk.mentoring.service.DimensionService;


@Service
public class DimensionServiceImpl implements DimensionService
{

	@Inject
	private DimensionDao dimensionDao;

	@Override
	public Dimension createDimension(final Dimension dimension)
	{
		return dimensionDao.insert(dimension);
	}

	@Override
	public void deleteDimension(final Long id)
	{
		dimensionDao.delete(id);
	}

	@Override
	public Dimension updateDimension(final Dimension dimension)
	{
		return dimensionDao.update(dimension);
	}
	//
	//	@Override
	//	public List<Dimension> getAllDimension()
	//	{
	//		// TODO Auto-generated method stub
	//		return null;
	//	}
	//
	//	@Override
	//	public Dimension getDimensionById(final Long id)
	//	{
	//		// TODO Auto-generated method stub
	//		return null;
	//	}

}

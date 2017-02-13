package com.dk.mentoring.dao.impl;

import org.springframework.stereotype.Repository;

import com.dk.mentoring.dao.DimensionDao;
import com.dk.mentoring.model.Dimension;


@Repository
public class DimensionDaoImpl extends AbstractDaoImpl<Dimension, Long> implements DimensionDao
{
	protected DimensionDaoImpl()
	{
		super(Dimension.class);
	}
}

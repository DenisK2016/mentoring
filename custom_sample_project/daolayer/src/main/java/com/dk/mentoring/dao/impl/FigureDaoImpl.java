package com.dk.mentoring.dao.impl;

import org.springframework.stereotype.Repository;

import com.dk.mentoring.dao.FigureDao;
import com.dk.mentoring.model.Figure;


@Repository
public class FigureDaoImpl extends AbstractDaoImpl<Figure, Long> implements FigureDao
{

	protected FigureDaoImpl()
	{
		super(Figure.class);
	}

}

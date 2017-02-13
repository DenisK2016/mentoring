package com.dk.mentoring.service;

import java.util.List;

import com.dk.mentoring.model.Figure;


public interface FigureService
{
	public List<Figure> getAllFigures();

	public Figure getFigureById(final Long id);

	public Figure createFigure(Figure figure);

	public Figure updateFigure(Figure figure);

	public void deleteFigure(Long id);

	public void volume(Long figureID);
}

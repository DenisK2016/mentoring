package com.dk.mentoring.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dk.mentoring.model.Figure;
import com.dk.mentoring.service.FigureService;


@Controller
public class FigureController
{

	@Autowired
	private FigureService figureService;

	@RequestMapping("/index")
	private String listFigures(final Map<String, Object> map)
	{
		map.put("figure", new Figure());
		map.put("allFigures", figureService.getAllFigures());
		return "figures";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addFigure(@ModelAttribute("figure") final Figure figure, final BindingResult result)
	{
		figureService.createFigure(figure);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{figureId}")
	public String deleteContact(@PathVariable("figureId") final Integer figureId)
	{
		figureService.deleteFigure(figureId.longValue());

		return "redirect:/index";
	}

	@RequestMapping("/volume/{figureId}")
	public String calculationVolume(@PathVariable("figureId") final Integer figureId)
	{
		figureService.volume(figureId.longValue());
		return "redirect:/index";
	}

}

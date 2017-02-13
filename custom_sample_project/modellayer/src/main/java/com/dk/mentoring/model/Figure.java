package com.dk.mentoring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "figure")
public class Figure
{

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name_of_figure")
	private String name;
	@OneToOne(mappedBy = "figure")
	private Dimension dimensions;

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public Dimension getDimensions()
	{
		return dimensions;
	}

	public void setDimensions(final Dimension dimensions)
	{
		this.dimensions = dimensions;
	}

}

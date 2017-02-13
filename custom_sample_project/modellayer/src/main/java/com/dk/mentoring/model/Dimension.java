package com.dk.mentoring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "dimension")
public class Dimension
{
	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "length")
	private Double length;
	@Column(name = "width")
	private Double width;
	@Column(name = "height")
	private Double height;
	@Column(name = "length_of_circle")
	private Long lengthOfCircle;
	@Column(name = "volume")
	private Double volume;
	@MapsId
	@OneToOne(fetch = FetchType.LAZY, optional = false, cascade =
	{ CascadeType.MERGE })
	@JoinColumn(nullable = false, updatable = false, name = "id")
	private Figure figure;

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public Double getLength()
	{
		return length;
	}

	public void setLength(final Double length)
	{
		this.length = length;
	}

	public Double getWidth()
	{
		return width;
	}

	public void setWidth(final Double width)
	{
		this.width = width;
	}

	public Double getHeight()
	{
		return height;
	}

	public void setHeight(final Double height)
	{
		this.height = height;
	}

	public Long getLengthOfCircle()
	{
		return lengthOfCircle;
	}

	public void setLengthOfCircle(final Long lengthOfCircle)
	{
		this.lengthOfCircle = lengthOfCircle;
	}

	public Figure getFigure()
	{
		return figure;
	}

	public void setFigure(final Figure figure)
	{
		this.figure = figure;
	}

	public Double getVolume()
	{
		return volume;
	}

	public void setVolume(final Double volume)
	{
		this.volume = volume;
	}
}

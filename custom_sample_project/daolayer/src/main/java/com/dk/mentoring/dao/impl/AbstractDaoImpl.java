package com.dk.mentoring.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import com.dk.mentoring.dao.AbstractDao;


@Transactional
public class AbstractDaoImpl<T, ID> implements AbstractDao<T, ID>
{

	@PersistenceContext
	protected EntityManager entityManager;
	private final Class<T> entityClass;

	protected AbstractDaoImpl(final Class<T> entityClass)
	{
		this.entityClass = entityClass;
	}

	@Override
	public List<T> getAll()
	{
		final CriteriaQuery<T> query = entityManager.getCriteriaBuilder().createQuery(getEntityClass());
		query.from(getEntityClass());
		final List<T> list = entityManager.createQuery(query).getResultList();
		return list;
	}

	@Override
	public T get(final ID id)
	{
		return entityManager.find(getEntityClass(), id);
	}

	@Override
	public T insert(final T entity)
	{
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public T update(T entity)
	{
		entity = entityManager.merge(entity);
		entityManager.flush();
		return entity;
	}

	@Override
	public void delete(final ID id)
	{
		entityManager.createQuery(String.format("delete from %s e where e.id = :id", entityClass.getSimpleName()))
				.setParameter("id", id).executeUpdate();
	}

	public EntityManager getEntityManager()
	{
		return entityManager;
	}

	public Class<T> getEntityClass()
	{
		return entityClass;
	}

}

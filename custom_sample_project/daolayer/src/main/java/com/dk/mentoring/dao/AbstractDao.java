package com.dk.mentoring.dao;

import java.util.List;

public interface AbstractDao<T, ID> {

	List<T> getAll();

	T get(final ID id);

	T insert(final T entity);

	T update(T entity);

	void delete(ID id);
}

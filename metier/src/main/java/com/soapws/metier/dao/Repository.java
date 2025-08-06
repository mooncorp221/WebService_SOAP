package com.soapws.metier.dao;

import java.util.List;

public interface Repository <T> {
    public boolean save(T entity);
    public boolean update(T entity);
    public boolean delete(Long id,T entity);
    public T findById(Long id,T entity);
    public List<T> findAll(T entity);
}

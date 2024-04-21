package com.tui.proof.dao.generic;

public interface GenericDao<T, K> {
    T save(T entity);
}

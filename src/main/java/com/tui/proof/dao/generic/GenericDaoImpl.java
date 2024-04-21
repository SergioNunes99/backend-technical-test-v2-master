package com.tui.proof.dao.generic;

import jakarta.transaction.Transactional;

@Transactional
public class GenericDaoImpl<T, K> implements GenericDao<T, K>{

    public T save(T entity){

    }
}

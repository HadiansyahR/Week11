package org.Repository;

import java.util.List;

public interface CRUDRepository<T, ID> {
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(int id);
    ID delete(T object);
}

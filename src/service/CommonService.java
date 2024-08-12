package service;

import java.util.List;

public interface CommonService<T> {
    void add(T common);
    void delete(int id);
    List<T>common();
    void  update(T common);
    T getById(int id);
}

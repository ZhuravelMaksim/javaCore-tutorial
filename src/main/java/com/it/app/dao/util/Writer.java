package com.it.app.dao.util;


import java.util.Collection;

public interface Writer<T> {
    void write(Collection<T> collection);
}

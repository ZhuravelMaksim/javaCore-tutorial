package com.it.app.dao.util;


import java.util.Collection;
import java.util.function.Function;

public interface Reader<T> {
    Collection<T> read(Function<Object, T> mapper);
}

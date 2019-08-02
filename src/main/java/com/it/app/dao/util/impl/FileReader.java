package com.it.app.dao.util.impl;

import com.it.app.annotation.processor.FileStoragePathProcessor;
import com.it.app.dao.util.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class FileReader<T> implements Reader<T> {

    final Class<T> typeParameterClass;

    public FileReader(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public Collection<T> read(Function<Object, T> mapper) {
        final String path = FileStoragePathProcessor.getInstance().getPath(typeParameterClass);
        final ArrayList<T> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                final T t = mapper.apply(o);
                list.add(t);
            }
        } catch (EOFException e) {
            //empty
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}

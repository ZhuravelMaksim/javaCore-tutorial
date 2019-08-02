package com.it.app.dao.util.impl;

import com.it.app.annotation.processor.FileStoragePathProcessor;
import com.it.app.dao.util.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;


public class FileWriter<T> implements Writer<T> {

    final Class<T> typeParameterClass;

    public FileWriter(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public void write(Collection<T> collection) {
        final String path = FileStoragePathProcessor.getInstance().getPath(typeParameterClass);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            collection.forEach((t) -> {
                try {
                    objectOutputStream.writeObject(t);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

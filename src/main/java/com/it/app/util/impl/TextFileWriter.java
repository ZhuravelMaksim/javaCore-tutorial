package com.it.app.util.impl;

import com.it.app.util.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;


public class TextFileWriter implements Writer<String> {

    private static TextFileWriter instance;

    public static TextFileWriter getInstance() {
        if (instance == null) {
            instance = new TextFileWriter();
        }
        return instance;
    }

    private TextFileWriter() {

    }

    @Override
    public void write(String source, Collection<?> collection) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(source)))) {
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

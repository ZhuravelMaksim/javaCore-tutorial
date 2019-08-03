package com.it.app.util.impl;

import com.it.app.util.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class TextFileReader implements Reader<String> {

    private static TextFileReader instance;

    public static TextFileReader getInstance() {
        if (instance == null) {
            instance = new TextFileReader();
        }
        return instance;
    }

    private TextFileReader() {

    }

    @Override
    public Collection<Object> read(String source) {
        final ArrayList<Object> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(source)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                list.add(o);
            }
        } catch (EOFException e) {
            //empty
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

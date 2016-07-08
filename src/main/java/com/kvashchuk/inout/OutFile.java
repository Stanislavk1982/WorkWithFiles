package com.kvashchuk.inout;

import java.util.List;

public class OutFile {
    private String path;
    List<Person> array;

    public OutFile(String path, List<Person> array) {
        this.path = path;
        this.array = array;
    }
}

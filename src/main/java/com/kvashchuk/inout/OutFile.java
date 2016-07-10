package com.kvashchuk.inout;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutFile {
    private String path;
    private List<Person> array;
    //private Person personTemp;

    public OutFile(String path, List<Person> array) {
        this.path = path;
        this.array = array;
    }

    public void toFileFromArrayList() throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("<students>");
        writer.newLine();
        for (Person person : array) {
            writer.write("\t<student>");
            writer.newLine();
            writer.write("\t\t<lastname>" + person.getLastname() + "</lastname>");
            writer.newLine();
            writer.write("\t\t<firstname>" + person.getFirstname() + "</firstname>");
            writer.newLine();
            writer.write("\t\t<age>" + person.getAge() + "</age>");
            writer.newLine();
            writer.write("\t</student>");
            writer.newLine();
            writer.newLine();
        }
        writer.write("</students>");

        writer.close();
    }
}

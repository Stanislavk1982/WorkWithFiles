package com.kvashchuk.inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InFile {
    private ArrayList<Person> array = new ArrayList<>();
    private String path;

    public InFile(String path) {
        this.path = path;
    }

    public ArrayList<Person> toArrayListFromFile() throws IOException {

        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        String[] tempPerson = new String[3];

        int i = 0;
        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(" ");
            switch (arr[0]) {
                case "Lastname:":
                    tempPerson[0] = arr[1].trim();
                    break;
                case "Firstname:":
                    tempPerson[1] = arr[1].trim();
                    break;
                case "Age:":
                    tempPerson[2] = arr[1].trim();
                    break;
            }
            i++;
            if (i == 3) {
                Person person = new Person(tempPerson[0], tempPerson[1], tempPerson[2]);
                array.add(person);
                i=0;
            }
        }

        reader.close();
        return array;
    }
}

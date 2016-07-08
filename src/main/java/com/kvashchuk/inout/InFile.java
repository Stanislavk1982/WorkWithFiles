package com.kvashchuk.inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class InFile {
    private List<Person> array;
    private String path;
    private Person persontemp;

    public InFile(List<Person> array, String path) {
        this.array = array;
        this.path = path;
    }

    public List<Person> toArrayListFromFile() throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        persontemp = new Person();
        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(" ");

            switch (arr[0]) {
                case "Lastname:":
                    persontemp.setLastname(arr[1]);
                    break;
                case "Firstname:":
                    persontemp.setFirstname(arr[1]);
                    break;
                case "Age:":
                    persontemp.setAge(arr[1]);
                    break;
            }
            if (persontemp.getLastname() != null && persontemp.getFirstname() != null && persontemp.getAge() != null) {
                System.out.println("Test0:" + persontemp.getFirstname() + persontemp.getLastname());
                array.add(persontemp);
                //persontemp=null;
                System.out.println("Test1:" + persontemp.getFirstname() + persontemp.getLastname());
                persontemp.setFirstname(null);
                persontemp.setLastname(null);
                persontemp.setAge(null);

            }

        }
        Person persontemp2 = array.get(0);
        System.out.println(array.size());
        System.out.println("Test2" + persontemp2.getFirstname() + persontemp2.getLastname());
        return array;
    }
}

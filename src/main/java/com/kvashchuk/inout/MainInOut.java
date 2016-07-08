package com.kvashchuk.inout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainInOut {
    public static void main(String[] args) {
        List<Person> array =new ArrayList<>();
        InFile inFile = new InFile(array, "e:\\in1.txt");
        OutFile outFile = new OutFile("e:\\out1.txt", array);
        try {
            array=inFile.toArrayListFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person persontemp1= new Person();
        persontemp1 = array.get(2);
        System.out.println(array.size());
        System.out.println(persontemp1.getFirstname()+persontemp1.getLastname());
    }
}

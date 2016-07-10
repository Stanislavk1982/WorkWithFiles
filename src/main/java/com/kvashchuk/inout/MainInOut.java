package com.kvashchuk.inout;

import java.io.IOException;
import java.util.ArrayList;

public class MainInOut {
    public static void main(String[] args) {
        ArrayList<Person> array1 =new ArrayList<>();
        InFile inFile = new InFile("e:\\in1.txt");

        try {
            array1=inFile.toArrayListFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutFile outFile = new OutFile("e:\\out1.xml", array1);
        try {
            outFile.toFileFromArrayList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person per : array1) {
            System.out.println("Test1"+per);
        }




    }
}

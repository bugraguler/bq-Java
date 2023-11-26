package com.classes.javainterviewprep;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFiles {
    public static void main(String[] args) throws IOException {
        String path="Files/Oefenen.properties";

        FileInputStream fileInputStream= new FileInputStream(path);

        Properties properties=new Properties();

        properties.load(fileInputStream);


        System.out.println(properties.get("senior"));

    }
}

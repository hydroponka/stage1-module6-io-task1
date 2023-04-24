package com.epam.mjc.io;

import java.io.*;
import java.math.BigDecimal;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        String name;
        String age;
        String email;
        String phone;
        try (BufferedReader bf = new BufferedReader(new java.io.FileReader(file))) {
            name = bf.readLine().split(": ")[1];
            age = bf.readLine().split(": ")[1];
            email = bf.readLine().split(": ")[1];
            phone = bf.readLine().split(": ")[1];

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Profile(name, Integer.parseInt(age), email, Long.parseLong(phone));
    }
}

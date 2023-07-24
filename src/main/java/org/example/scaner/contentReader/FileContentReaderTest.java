package org.example.scaner.contentReader;

import java.io.File;

public class FileContentReaderTest {

    public static void main(String[] args) {
        FileContentReader fcr = new FileContentReaderImpl();
        String read = fcr.read(new File("./files/aaa.txt"));
        System.out.println("read = " + read);
    }
}

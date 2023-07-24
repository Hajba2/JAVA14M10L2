package org.example.fileEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateTest {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./files/created-from-fos.txt");

        fos.close();

        new File("./files/created-from-file.txt").createNewFile();
        new File("./files/dirc").mkdir();
        new File("./files/dird/hello").mkdirs();

        File dir = new File("./files/dird/hello");
        File file = new File(dir, "file-from-file-constr.txt");
        file.createNewFile();
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
    }
}

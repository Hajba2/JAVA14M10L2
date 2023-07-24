package org.example.scaner.scanFiles;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ScannerTest {

    public static void main(String[] args) throws IOException {
        DirScanner dirScanner = new DirScannerImpl();
        Collection<File> scanned = dirScanner.scan(new File("./files"));

        for (File f : scanned) {
            System.out.println("f.getCanonicalPath() = " + f.getCanonicalPath());
        }
    }
}

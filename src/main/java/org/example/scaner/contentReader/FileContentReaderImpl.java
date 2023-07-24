package org.example.scaner.contentReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class FileContentReaderImpl implements FileContentReader {

    @Override
    public String read(File file) {
        StringJoiner sj = new StringJoiner("\n");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                sj.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return sj.toString();
    }

}

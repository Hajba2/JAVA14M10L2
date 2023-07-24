package org.example.scaner;

import org.example.scaner.contentReader.FileContentReader;
import org.example.scaner.contentReader.FileContentReaderImpl;
import org.example.scaner.contentSearcher.ContentSearcher;
import org.example.scaner.contentSearcher.ContentSearcherImpl;
import org.example.scaner.scanFiles.DirScanner;
import org.example.scaner.scanFiles.DirScannerImpl;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class Scanner {

    private File file;
    private String searchBy;

    public Scanner(File file, String searchBy) {
        this.file = file;
        this.searchBy = searchBy;
    }

    public void doSearch() throws IOException {
        DirScanner dirScanner = new DirScannerImpl();
        Collection<File> files = dirScanner.scan(file);

        FileContentReader fileContentReader = new FileContentReaderImpl();
        ContentSearcher contentSearcher = new ContentSearcherImpl();

        for (File f : files) {
            String content = fileContentReader.read(f);
            if (contentSearcher.search(content, searchBy)) {
                System.out.println(searchBy + " is found in file" + f.getCanonicalPath());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("./files"), "java");
        scanner.doSearch();
    }
}

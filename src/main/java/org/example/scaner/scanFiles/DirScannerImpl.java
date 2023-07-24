package org.example.scaner.scanFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DirScannerImpl implements DirScanner {

    @Override
    public Collection<File> scan(File dir) {
        List<File> fileList = new ArrayList<>();

        recursiveScan(fileList, dir);

        return fileList;
    }

    private void recursiveScan(List<File> fileList, File dir) {
        for(File fileOrDir: dir.listFiles()) {
            if (fileOrDir.isFile()) {
                fileList.add(fileOrDir);
            } else {
                recursiveScan(fileList, fileOrDir);
            }
        }
    }

}

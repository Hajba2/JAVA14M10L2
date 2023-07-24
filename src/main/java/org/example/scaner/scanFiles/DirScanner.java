package org.example.scaner.scanFiles;

import java.io.File;
import java.util.Collection;

public interface DirScanner {

    Collection<File> scan(File file);

}

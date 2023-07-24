package org.example.scaner.contentSearcher;

public class ContentSearcherTest {

    public static void main(String[] args) {
        ContentSearcher contentSearcher = new ContentSearcherImpl();
        System.out.println("contentSearcher.search(\"hello from java to students\", \"JAVA\") = " +
                contentSearcher.search("hello from java to students", "JAVA"));
    }
}

package org.example.scaner.contentSearcher;

public class ContentSearcherImpl implements ContentSearcher{
    @Override
    public boolean search(String toSearchIn, String searchBy) {
        return toSearchIn.toLowerCase().contains(searchBy.toLowerCase());
    }
}

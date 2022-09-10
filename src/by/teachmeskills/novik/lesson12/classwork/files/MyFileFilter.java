package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.File;
import java.io.FileFilter;
                        //interface for filtering
public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".xml");
    }
}

package com.example.pattern_visitor.example_2.visitor;

import com.example.pattern_visitor.example_2.Entry;
import com.example.pattern_visitor.example_2.Visitor;
import com.example.pattern_visitor.example_2.entry.Directory;
import com.example.pattern_visitor.example_2.entry.File;

import java.util.ArrayList;
import java.util.Iterator;

public class FileVisitor implements Visitor {

    String currentDir = "";
    String suffix;
    ArrayList files = new ArrayList();

    public FileVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            // System.out.println(currentDir+"/"+file);
            files.add(currentDir + "/" + file);
        }
    }

    @Override
    public void visit(Directory directory) {
        String saveDir = currentDir;
        currentDir += ("/" + directory.getName());
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }

   public Iterator getFiles() {
        return files.iterator();
    }
}

package com.example.pattern_visitor.example_2.visitor;

import com.example.pattern_visitor.example_2.Entry;
import com.example.pattern_visitor.example_2.Visitor;
import com.example.pattern_visitor.example_2.entry.Directory;
import com.example.pattern_visitor.example_2.entry.File;

import java.util.Iterator;

public class ListVisitor implements Visitor {
    String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir += ("/" + directory.getName());
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}

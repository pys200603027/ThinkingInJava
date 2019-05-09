package com.example.pattern_visitor.example_2;


import com.example.pattern_visitor.example_2.entry.Directory;
import com.example.pattern_visitor.example_2.entry.File;

public interface Visitor {
    void visit(File file);

    void visit(Directory directory);
}

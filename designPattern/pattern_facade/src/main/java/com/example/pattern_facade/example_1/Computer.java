package com.example.pattern_facade.example_1;

import com.example.pattern_facade.example_1.subsystem.CPU;
import com.example.pattern_facade.example_1.subsystem.Disk;
import com.example.pattern_facade.example_1.subsystem.Memory;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start()
    {
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutDown()
    {
        System.out.println("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("Computer shutDown end...");
    }
}

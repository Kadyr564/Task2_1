package ru.vsu.cs.course1;

import ru.vsu.cs.util.ArrayUtils;

import java.io.FileReader;
import java.io.FileWriter;



public class Console {

    public static void play(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter(args[2]);

        int[] arr = Enter.enter(args);
        int [] out;
        out = Task.process(arr);
        int n = out[0];
        System.out.print(n);
        String b = String.valueOf(n);
        fileWriter.write(b);
        fileWriter.close();


    }
}
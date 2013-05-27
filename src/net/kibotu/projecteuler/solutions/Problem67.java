package net.kibotu.projecteuler.solutions;

import java.io.File;
import java.io.IOException;

public class Problem67 {

    public int getSolution(String filename) throws IOException {
        File f = new File("" + File.separator + "problem_67", filename);
        Problem18 p18 = new Problem18(f);
        return p18.getMaximumRoute();
    }

}
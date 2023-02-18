package com.company;

import service.MowerService;

public class Main {

    public static void main(String[] args) {
        // if the file name is not given then use the test file name
        if (args.length != 1 || args[0] == null || args[0].isEmpty())
            MowerService.mow("src/testFile/test.txt");
        else MowerService.mow(args[0]);
    }
}

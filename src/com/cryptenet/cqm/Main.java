package com.cryptenet.cqm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        try {
//            int div = 1/0;
//        } catch (ArithmeticException exception) {
//            throw new ArithmeticException("Cannot divide by zero!!");
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            throw new ArrayIndexOutOfBoundsException("You are out of your limit!!");
//        } finally {
//            throw new IllegalArgumentException("You got botched!!");
//        }

        try {
            int div = 1/0;
        } catch (Exception exception) {
            throw new Exception("Cannot divide by zero!!");
        }

//        try {
//            int div = 1/0;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
//            throw new ArithmeticException("You did something wrong mate!!");
//        } finally {
//            throw new IllegalArgumentException("You got botched!!");
//        }

        try(Scanner scanner = new Scanner(new File("file.txt"))) {
            //read file
        } catch (FileNotFoundException exception) {
            // handle exception
        }
    }
}

package Primality_test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BigINT {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bi = new BigInteger(n);

        System.out.println(bi.isProbablePrime(1)?"prime":"not prime");
        scanner.close();
    }
}

package org.javaPrograms;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.sql.DriverManager.println;

public class StreamLinedAPIs {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 13);
        //numbers.stream().filter(n-> n>=5).forEach(n ->System.out.println("Number greater then "+ n));
        numbers.parallelStream().filter(n-> n%2==0).forEach(System.out::println);
    }
}

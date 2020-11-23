/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.exercise14_2;

/**
 *
 * @author FRIEDRICH
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirList {
  public static void main(String[] args) {
                
    try(Stream<Path> files = Files.list(Paths.get("."))){

        System.out.println("\n=== Dir list ===");
        files.forEach(line -> System.out.println(line));            

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
  } 
}

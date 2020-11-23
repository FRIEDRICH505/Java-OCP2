/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.exercise14_1;

/**
 *
 * @author FRIEDRICH
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class P02NioRead {
    
    public static void main(String[] args) {
        
        try(Stream<String> lines = Files.lines(Paths.get("hamlet.txt"))){
            
            System.out.println("\n=== Entire File ===");
            lines.forEach(line -> System.out.println(line)); 
            
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}

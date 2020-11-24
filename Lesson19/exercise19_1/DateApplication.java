/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson19.exercise19_1;

/**
 *
 * @author FRIEDRICH
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateApplication {

    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Locale ruLocale = new Locale("ru", "RU");
    Locale currentLocale = Locale.US;
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.US);

    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter df;

    public static void main(String[] args) {
        DateApplication dateApp = new DateApplication();
        dateApp.run();
    }

    public void run() {
        String line = "";

        while (!(line.equals("q"))) {
            this.printMenu();
            try {
                line = this.br.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            switch (line) {
                case "1":
                    this.setEnglish();
                    break;
                case "2":
                    this.setFrench();
                    break;
                case "3":
                    this.setChinese();
                    break;
                case "4":
                    this.setRussian();
                    break;
            }
        }
    }

    public void printMenu() {
        pw.println("=== Date App ===");

        pw.println("\n--- Choose Language Option ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + " ");
    }

    public void setEnglish() {

    }

    public void setFrench() {

    }

    public void setChinese() {

    }

    public void setRussian() {

    }
}

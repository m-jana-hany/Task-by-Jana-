/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Crudask;

/**
 *
 * @author Administrator
 */
import java.io.*;

public class EditFile {
    public static void main(String[] args) {
        try {
            File file = new File("crud.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            reader.close();

            String[] parts = line.split(",");
            String username = parts[0];
            String password = parts[1];

            String newUsername = "newUser";
            String newPassword = "newPassword";

            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(newUsername + "," + newPassword);
            bufferedWriter.close();
            System.out.println("Username and password edited successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc;

import edu.kcc.animal.Animal;
import edu.kcc.ui.UIUtility;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author William Clark
 */
public class Main {

    private static final int PORT = 5555;
    private static final String HOST_NAME = "YURY-BOT";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIUtility.showMessage("Program starting...");

        // Define variables
        String menuTitle = "Main Menu";
        String[] menuOptions = {
            "1) Find an animal ",
            "2) Show lookup history",
            "3) Exit"
        };
        String prompt = "Your choice:";
        String errorMessage = "Invalid option.  Please try again.";
        String userChoice;

        // Start the primary program logic
        boolean working = true;
        while (working) {
            userChoice = UIUtility.showMenuOptions(menuTitle,
                    prompt, menuOptions);
            switch (userChoice) {
                case "1":
                    //
                    String name = UIUtility.getUserString("Please enter the name of animal: ");
                    try{
                        System.out.println("Animal found: " + getAnimalFromServer(name).toString());
                    } catch(UnknownHostException uhe){
                        System.out.println("ERROR: " + uhe.getMessage());
                        System.out.println("Program terminating!");
                        System.exit(-1);
                    } catch(IOException ioe) {
                        System.out.println("ERROR: " + ioe.getMessage());
                    }
                    break;
                case "2":
                    //
                    break;
                case "3":
                    //
                    break;
                default:
                    UIUtility.showErrorMessage(errorMessage, true);
            }
        }
        UIUtility.showMessage("\nProgram complete.");
    }

    private static Animal getAnimalFromServer(String name) throws UnknownHostException, IOException {
        Animal animalOut;
        Socket socket = new Socket(HOST_NAME, PORT);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        outputStream.writeUTF(name);
        outputStream.flush();
        
        // Construct the animal
        String Id = inputStream.readUTF();
        String nameIn = inputStream.readUTF();
        String species = inputStream.readUTF();
        String gender = inputStream.readUTF();
        int age = inputStream.readInt();
        boolean fixed = inputStream.readBoolean();
        int legs = inputStream.readInt();
        BigDecimal weight = BigDecimal.valueOf(inputStream.readDouble());
        LocalDate dateAdded = LocalDate.parse(inputStream.readUTF());
        LocalDateTime lastFeedingTime = LocalDateTime.parse(inputStream.readUTF());
        
        animalOut = new Animal(Id, nameIn, species, gender, age, fixed, legs, weight, dateAdded, lastFeedingTime);
        
        inputStream.close();
        outputStream.close();
        return animalOut;
    }
}

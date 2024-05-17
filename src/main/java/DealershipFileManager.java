import java.io.*;
import java.util.Scanner;

public class DealershipFileManager {
    Scanner userInput = new Scanner(System.in);

    private int vin,year,odometer;
    private String make,model,vehicleType,color;
    private double price;


    public DealershipFileManager() {

    }

    public void getDealership() {
        try {
            Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,
                    odometer, price);

            // create a FileReader object connected to the file
            FileReader dealership = new FileReader("src/main/resources/inventory.csv");

            //create a bufferedReader to manage input stream
            BufferedReader bufferedReader = new BufferedReader(dealership);

            String input;

            // read until there is no more data
            while ((input = bufferedReader.readLine()) !=null) {
                System.out.println(input);
            }

            // Create a filewriter
            FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv");

            // Create a bufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.print ("");

            // Prompt user to overwrite file including the vin, year, make, model, vehicle type, color, odo and price.

//            System.out.printf("Please enter the last 5 digits of the vin: %d, Year: %d, Make: %s, Model: %s, Vehicle type: %s, Color: %s, Odometer:  %d, Price: %.2f ",
//            vin, year,make,model,vehicleType,color,odometer,price);


            // close the stream and release the resources
            bufferedReader.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }

    public void saveDealership() {

    }

}
